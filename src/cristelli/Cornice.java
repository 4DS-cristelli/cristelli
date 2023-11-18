package cristelli;

public class Cornice {
    private float base;
    private float altezza;
    private float spessore;

    public Cornice(float base, float altezza, float spessore)throws Exception{
        setBase(base);
        setAltezza(altezza);
        setSpessore(spessore);
    }

    public Cornice(Cornice c1){
        this.base = c1.getBase();
        this.altezza = c1.getAltezza();
        this.spessore = c1.getSpessore();
    }
    private void setBase(float base)throws Exception{
        if(base>= 0) {
            this.base = base;
        }else{
            throw new Exception("Base errata");
        }
    }

    private void setAltezza(float altezza)throws Exception{
        if(altezza>= 0) {
            this.altezza = altezza;
        }else{
            throw new Exception("altezza errata");
        }
    }

    private void setSpessore(float spessore)throws Exception{
        if(spessore>= 0) {
            this.spessore = spessore;
        }else{
            throw new Exception("spessore errata");
        }
    }

    public float getBase() {
        return base;
    }

    public float getAltezza() {
        return altezza;
    }

    public float getSpessore() {
        return spessore;
    }

    public double printingombro(){
        double ingombro;
        ingombro = (base*altezza)-((base-spessore*2)*(altezza-spessore*2));
        return ingombro;
    }

    public boolean verificaFimensioni(float Qbase, float Qaltezza){
        boolean uguali = false;
        if((base-spessore*2)== Qbase && (altezza-spessore*2)== Qaltezza){
            uguali = true;
        }
        return uguali;
    }

    @Override
    public String toString() {
        return "Cornice{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", spessore=" + spessore +
                '}';
    }
}
