package cristelliArte;

public class Supporto {
    private float base;
    private float altezza;
    private float profondita;

    public Supporto(float base, float altezza, float profondita)throws Exception{
        setBase(base);
        setAltezza(altezza);
        setProfondita(profondita);
    }

    public Supporto(Supporto s1){
        this.base= s1.getBase();
        this.altezza= s1.getAltezza();
        this.profondita= s1.getProfondita();
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

    private void setProfondita(float profondita)throws Exception{
        if(profondita>= 0) {
            this.profondita = profondita;
        }else{
            throw new Exception("profondita errata");
        }
    }

    public float getBase() {
        return base;
    }

    public float getAltezza() {
        return altezza;
    }

    public float getProfondita() {
        return profondita;
    }

    public double printingombro(){
        double ingombro;
        ingombro = base*altezza*profondita;
        return ingombro;
    }

    @Override
    public String toString() {
        return "Supporto{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", profondita=" + profondita +
                '}';
    }
}
