package cristelliStudente;

import java.util.Arrays;

public class Classe {
    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti)throws Exception{
        this.capoClasse = new Studente(capoClasse);
        this.studenti = studenti.clone();
    }

    public Studente getCapoClasse() {
        return new Studente(capoClasse);
    }

    public Studente[] getStudenti() {
        return studenti.clone();
    }

    public void setCapoClasse(Studente capoClasse) {
        this.capoClasse = new Studente(capoClasse);
    }

    public void setStudenti(Studente[] studenti) {
        this.studenti = studenti.clone();
    }

    public void invertiAttributi()throws Exception{
        if(studenti.length==0){
            throw new Exception("Non ci sono studenti");
        }
        String tmp;
        Integer i;
        for(i = 0; i< studenti.length; i++){
            tmp = studenti[i].getCognome();
            studenti[i].setCognome(studenti[i].getNome());
            studenti[i].setNome(tmp);
        }
    }

    @Override
    public String toString() {
        return "Classe{" +
                "capoClasse=" + capoClasse +
                ", studenti=" + Arrays.toString(studenti) +
                '}';
    }
}
