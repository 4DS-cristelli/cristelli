package cristelliStudente;

import java.util.Locale;

public class Studente {
    private String nome;
    private String cognome;

    public Studente(String n, String c)throws Exception{
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }

    private boolean controllaStringa(String stringa)throws Exception{
        if(stringa.length()<3){

            throw new Exception("Nome o Cognome tropo corti");
        }
        return true;
    }

    private String sistemaStringa(String s){
        s = s.toLowerCase(Locale.ROOT);
        s= s.replaceAll(" ","");
        char tmpC= Character.toUpperCase(s.charAt(0));
        s = s.substring(1);
        String def = tmpC+s;
        return def;
    }
}
