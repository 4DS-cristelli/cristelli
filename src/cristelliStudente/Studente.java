package cristelliStudente;


import java.lang.invoke.WrongMethodTypeException;

public class Studente {
    private String nome;
    private String cognome;

    public Studente(String n, String c)throws Exception{
        try {
            setNome(n);
            setCognome(c);

        }catch (ArithmeticException e){
            throw new ArithmeticException(e.getMessage());
        } catch(Exception e){
            throw new Exception(e.getMessage());
        }
        if(controllaStringa(n) && controllaStringa(c)){
            this.nome = n;
            this.cognome = c;
        }else{
            throw new Exception("Stringa non inizializzata");
        }

        //controllo stringhe
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
        try{
            if(controllaStringa(nome)){
                this.nome = nome;
            }
        }catch (ArithmeticException e){
            throw new ArithmeticException(e.getMessage());
        }catch (NullPointerException e) {
            throw new NullPointerException("Nome nullo");
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public void setCognome(String cognome)throws Exception{
        try{
            if(controllaStringa(cognome)){
                this.cognome = cognome;
            }
        }catch (NullPointerException e) {
            throw new NullPointerException("Cognome nullo");
        }catch (Exception e){
            throw new Exception(e.getMessage());
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


}