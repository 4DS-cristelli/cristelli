package cristelliStudente;


import java.lang.invoke.WrongMethodTypeException;

public class Studente {
    private String nome;
    private String cognome;

    public Studente(String n, String c)throws Exception{
        setNome(n);
        setCognome(c);
    }

    public Studente(Studente s){
        this.nome = s.nome;
        this.cognome = s.cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) throws Exception{
        if(controllaStringaManuale(nome)){
            this.nome = nome.trim();
        }

    }

    public void setCognome(String cognome)throws Exception{
        if(controllaStringaManuale(cognome)){
            this.cognome = cognome.trim();
        }
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }
    private boolean controllaStringa(String stringa)throws Exception{
        /*
        try{
            int a = 0/0;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }*/

        try {
            if(stringa.length()<3){
                throw new Exception("Stringa troppo corta");
            }
            //controllo i nomi composti es Maria Beatrice
            String[] tmp = stringa.split(" ");
            if(tmp.length==0){
                throw new Exception("Stringa vuota");
            }
            int i;
            for(i= 0; i<tmp.length;i++){
                if(!tmp[i].matches("[A-Z a-z]*")){//
                    throw new Exception("iniziali sbagliate");
                }
            }
        }catch (NullPointerException e){
            throw new NullPointerException(e.getMessage());
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return true;
    }

    private boolean controllaStringaManuale(String stringa)throws Exception{
        try {
            if(stringa.length()<3){
                throw new Exception("Stringa troppo corta");
            }
            //controllo i nomi composti es Maria Beatrice
            String[] tmp = stringa.split(" ");
            if(tmp.length==0){
                throw new Exception("Stringa vuota");
            }
            int i;
            int j;
            for(i = 0; i<tmp.length;i++){
                if(tmp[i].equals("")){
                    throw new Exception("Doppio spazio");
                }
                if(!(tmp[i].charAt(0)>= 65 &&tmp[i].charAt(0)<= 90)){
                    throw new Exception("iniziali sbagliate");
                }
                for (j= 1;j<tmp[i].length()-1;j++){//ciclo fino alla penultima lettera
                    if(!(tmp[i].charAt(j)>= 97 &&tmp[i].charAt(j)<= 122)){
                        //aggiungo controllo con apostrofi e lettere accentate infondo al cognome
                        throw new Exception("iniziali sbagliate");
                    }
                }

                char ultimaLettera= tmp[i].charAt(j);

                if(!(ultimaLettera>= 97 && ultimaLettera<= 122) && !(ultimaLettera == 39) && !(ultimaLettera == 'è') && !(ultimaLettera == 'ì') && !(ultimaLettera == 'à') && !(ultimaLettera == 'ò')&& !(ultimaLettera == 'ù')){//o appartiene all alfabeto o è l'apostrofo (se non è aflabetico o apostrofo o minuscole accentate
                    //aggiungo controllo con apostrofi e lettere accentate infondo al cognome
                    throw new Exception("iniziali sbagliate");
                }
                /*
                //controllo ulitma lettera manualmente
                if(!(tmp[i].charAt(j)>= 97 &&tmp[i].charAt(j)<= 122) || !(tmp[i].charAt(j) == 39) || !(tmp[i].charAt(j) == 133)|| !(tmp[i].charAt(j) == 138)|| !(tmp[i].charAt(j) == 141)|| !(tmp[i].charAt(j) == 149)|| !(tmp[i].charAt(j) == 151)){//o appartiene all alfabeto o è l'apostrofo (se non è aflabetico o apostrofo o minuscole accentate
                    //aggiungo controllo con apostrofi e lettere accentate infondo al cognome
                    throw new Exception("iniziali sbagliate");
                }
                */

            }
        }catch (NullPointerException e){
            throw new NullPointerException(e.getMessage());
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        return true;
    }


}