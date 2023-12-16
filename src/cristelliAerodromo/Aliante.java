package cristelliAerodromo;

public class Aliante extends Aeromobile{
    private Integer effAereodinamica;

    public Aliante(String sigla, Integer effAereodinamica)throws Exception{
        super(sigla);
        setEffAereodinamica(effAereodinamica);
    }

    public Integer getEffAereodinamica() {
        return effAereodinamica;
    }

    public void setEffAereodinamica(Integer effAereodinamica)throws Exception{
        if(effAereodinamica > 0) {
            this.effAereodinamica = effAereodinamica;
        }else{
            throw new Exception("Efficenza <=0");
        }
    }

    @Override
    public Boolean equals(Aeromobile a1) {
        Boolean uguali = false;
        if(a1 instanceof Aliante){
            if(a1.getSigla().equals(getSigla()) && ((Aliante) a1).getEffAereodinamica()== effAereodinamica){
                uguali = true;
            }
        }
        return uguali;
    }

    @Override
    public Boolean superioreAeromobile(Aeromobile a1) {
        Boolean superiore = false;
        if(a1 instanceof Aliante){
            if(((Aliante) a1).getEffAereodinamica()>effAereodinamica){
                superiore = true;
            }
        }
        return superiore;
    }

    @Override
    public String toString() {
        String stringa = toString()+", efficenza: "+effAereodinamica;
        return stringa;
    }
}
