package cristelli;

public class StudenteEreditato extends PersonaStudente {


    public StudenteEreditato(){

    }

    public StudenteEreditato(String congnome, String nome, String codFisc, String dataDiNascita, String email, String cognome, String nome1, String codFisc1, String dataDiNascita1) throws Exception {
        super(congnome, nome, codFisc, dataDiNascita, email);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj){
        StudenteEreditato s1 = (StudenteEreditato) obj;
        boolean uguale= false;

        if(s1.getNome().equals(getNome())){
            if(s1.getCognome().equals(getCognome())){
                if(s1.getCodFisc().equals(getCodFisc())){
                    if(s1.getDataDiNascita().equals(getDataDiNascita())){
                        uguale = true;
                    }
                }
            }
        }
        return uguale;
    }

    public int hashCode(){
        return super.hashCode();
    }

    public String toString(){
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
