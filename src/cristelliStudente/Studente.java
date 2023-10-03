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
            this.nome = sistemaStringa(n);
            this.cognome = sistemaStringa(c);
        }else{
            throw new Exception("Stringa non inizializzata");
        }

        //controllo stringhe
    }

    public Studente(Studente s){
        this.nome = s.getNome();
        this.cognome = s.getCognome();
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
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public void setCognome(String cognome)throws Exception{
        try{
            if(controllaStringa(cognome)){
                this.cognome = cognome;
            }
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


        if(stringa == null){
            throw new NullPointerException("Stringa a null");
        }

        if(stringa.length()<3){
            throw new Exception("Stringa troppo corta");
        }
        //controllo i nomi composti es Maria Beatrice
        String[] tmp = stringa.split(" ");
        int i;
        for(i= 0; i<tmp.length;i++){
            if(!tmp[i].matches("[A-Z][a-z]*")){
                throw new Exception("iniziali sbagliate");
            }
        }
        return true;
    }

    private String sistemaStringa(String s){
        s = s.toLowerCase(); //rende tutta la stringa minuscola
        s= s.replaceAll(" ",""); //elima tutti li spazi
        char tmpC= Character.toUpperCase(s.charAt(0)); //prende la prima lettera e crea un char maiuscolo di quella lettera
        s = s.substring(1);//tolgo la prima lettera miniscola
        String def = tmpC+s;//aggiungo la prima lettera precedentemente resa maiuscola
        return def;
    }
}