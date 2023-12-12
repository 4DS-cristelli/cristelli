package cristelliStudentePersona;

import org.apache.commons.validator.routines.EmailValidator;

import java.time.LocalDate;

public class PersonaStudente {
    private String cognome;
    private String nome;
    private String codFisc;
    private String dataDiNascita;

    private String email;
    protected static int numeroIstanze = 0;

    public PersonaStudente(){
        numeroIstanze++;
    }

    public PersonaStudente(String congnome, String nome, String codFisc, String dataDiNascita, String email)throws Exception{
        this();
        setCongnome(congnome);
        setNome(nome);
        setCodFisc(codFisc);
        setDataDiNascita(dataDiNascita);
        setEmail(email);
    }

    public PersonaStudente(PersonaStudente p1)throws Exception{
        setCongnome(p1.getCognome());
        setNome(p1.getNome());
        setCodFisc(p1.getCodFisc());
        setDataDiNascita(p1.getDataDiNascita());
        numeroIstanze++;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCongnome(String congnome) throws Exception{
        if(controllaNome(congnome)){
            this.cognome = congnome.trim();
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email)throws Exception{
        EmailValidator emailValidator = EmailValidator.getInstance();
        if(emailValidator.isValid(email)){
            this.email = email;
        }else{
            throw new Exception("email non valida");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome)throws Exception {
        if(controllaNome(nome)){
            this.nome = nome.trim();
        }
    }

    public String getCodFisc() {
        return codFisc;
    }

    public void setCodFisc(String codFisc) throws Exception{
        if(controlloFiscale(codFisc)){
            this.codFisc = codFisc;
        }
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String data) throws Exception{
        if(data == null){
            throw new Exception("Data a null");
        }
        data = data.trim();
        if(data.contains((" "))){
            throw new Exception("Spazi tra le cifre");
        }
        if(!data.contains("-")){
            throw new Exception("Formato sbagliato");
        }
        try{
            String[] array= data.split("-");
            Integer gg = Integer.valueOf(array[0]);
            Integer mm = Integer.valueOf(array[1]);
            Integer aaaa = Integer.valueOf(array[2]);
            if(controlloData(gg,mm,aaaa)){
                this.dataDiNascita = data;
            }
        }catch (NullPointerException e){
            throw new NullPointerException();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }


    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public int calcolaEta(){
        LocalDate todaysDate = LocalDate.now();
        String dataOggi = String.valueOf(todaysDate);
        //oggi
        String[] array= dataOggi.split("-");
        Integer ggOggi = Integer.valueOf(array[2]);
        Integer mmOggi = Integer.valueOf(array[1]);
        Integer aaaaOggi = Integer.valueOf(array[0]);

        //persona
        String[] array1= dataDiNascita.split("-");
        Integer ggPersona = Integer.valueOf(array1[0]);
        Integer mmPersona = Integer.valueOf(array1[1]);
        Integer aaaaPersona = Integer.valueOf(array1[2]);

        Integer etaPersona;
        if(ggOggi<= ggPersona && mmOggi <= mmPersona){
             etaPersona = aaaaOggi-aaaaPersona;
        }else{
            etaPersona = aaaaOggi-aaaaPersona-1;
        }
        return etaPersona;

    }

    private boolean controllaNome(String nome)throws Exception{
        boolean corretto = false;
        int i;
        int j;
        char tmp;
        if(nome != null){//controllo che non sia null
            String[] array = nome.split(" ");//divido dove ci sono gli spazi
            for(i= 0; i< array.length;i++){//controllo parola per parola che sia >= 3 caratteri

                if(array[i].length()<3){
                    throw new MyException("Nome troppo corto o doppio spazio");
                }
            }

            for(i= 0; i< array.length;i++){//controllo parola per parola che sia >= 3 caratteri
                tmp = array[i].charAt(0);
                if(!(tmp>=65 && tmp<= 90)){
                    throw new MyException("iniziale sbagliata");
                }
                for(j= 1; j<array[i].length()-1;j++){//controllo dalla seconda fino alla penultima lettera
                    tmp = array[i].charAt(j);
                    if(!(tmp>=97 && tmp<= 122)){
                        throw new MyException("lettera sbagliata");
                    }
                }
                tmp = array[i].charAt(j);
                if(!((tmp>=97 && tmp<=122)||(tmp == 'à' || tmp =='è'|| tmp =='ù'|| tmp =='ò'|| tmp =='ì'|| tmp ==39))){
                    throw new MyException("lettera finale sbaglita");
                }
            }
        }else{
            throw new MyException("Parametro a null");
        }
        return true;
    }

    private boolean controlloFiscale(String codice)throws Exception{
        if(codice == null){
            throw new MyException("Parametro a null");
        }
        if(codice ==""){
            throw new MyException("attributo vuoto");
        }
        if(!(codice.matches("[A-Z]{6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{3}[A-Z]"))){
            throw new MyException("codice Sbagiato");
        }
        return true;
    }

    private boolean controlloData(int giorno, int mese, int anno)throws Exception{
        boolean corretta = false;
        int[] mesi = {31, 28,31, 30, 31,30,31,31,30,31,30,31};
        int[] mesiBisestile = {31, 29,31, 30, 31,30,31,31,30,31,30,31};

        if(controlloBisestile(anno)){
            if(mese>=1 &&mese<=12){
                if(giorno >= 1 &&giorno<=mesiBisestile[mese-1]){
                    corretta = true;
                }else{
                    throw new Exception("giorno sbagliato");
                }
            }else{
                throw new Exception("mese sbagliato");
            }
        }else{
            if(mese>=1 &&mese<=12){
                if(giorno >= 1 &&giorno<=mesi[mese-1]){
                    corretta = true;
                }else{
                    throw new Exception("giorno sbagliato");
                }
            }else{
                throw new Exception("mese sbagliato");
            }
        }
        return corretta;
    }

    private boolean controlloBisestile(int anno){
        boolean bisestile = false;
        if(anno%4 == 0){
            bisestile = true;
        }
        return bisestile;
    }

    public boolean verificaOmonimia(PersonaStudente p1)throws Exception{
        boolean uguali = false;
        if(controllaNome(p1.getNome())){
            if(controllaNome(p1.getCognome())){
                if(p1.getNome().equals(nome) && p1.getCognome().equals(cognome)){
                    uguali = true;
                }
            }else{
                throw new MyException("cognome inserito non valido");
            }
        }else{
            throw new MyException("nome inserito non valido");
        }
        return uguali;
    }

    @Override
    public String toString() {
        String stringa;
        stringa= "[" + cognome + ", " + nome + ", " + codFisc + ", "+dataDiNascita+"]";
        return stringa;
    }
}


class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}