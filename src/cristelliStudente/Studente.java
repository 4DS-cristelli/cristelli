package cristelliStudente;

public class Studente {
    private String nome;
    private String cognome;

    public Studente(String n, String c){
        this.nome = n;
        this.cognome = c;
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
}
