package cristelliAerodromo;

public class AeroMotore extends Aeromobile{
    private Double cv;

    public AeroMotore(String sigla, Double cv)throws Exception{
        super(sigla);
        setCV(cv);
    }

    public Double getCV() {
        return cv;
    }

    public void setCV(Double cv)throws Exception{
        if(cv > 0) {
            this.cv = cv;
        }else{
            throw new Exception("Efficenza <=0");
        }
    }

    @Override
    public Boolean equals(Aeromobile a1) {
        Boolean uguali = false;
        if(a1 instanceof Aeromobile){
            if(a1.getSigla().equals(getSigla()) && ((AeroMotore) a1).getCV()== cv){
                uguali = true;
            }
        }
        return uguali;
    }

    @Override
    public Boolean superioreAeromobile(Aeromobile a1) {
        Boolean superiore = false;
        if(a1 instanceof Aeromobile){
            if(((AeroMotore) a1).getCV()>cv){
                superiore = true;
            }
        }
        return superiore;
    }

    @Override
    public String toString() {
        String stringa = toString()+", potenza: "+cv;
        return stringa;
    }

}
