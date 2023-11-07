package cristelliArte;

public class Quadro extends Operadarte{
    private float altezza;
    private float larghezza;

    public Quadro(String titolo, String artista, float altezza, float larghezza){
        super(titolo, artista);
        setAltezza(altezza);
        setLarghezza(larghezza);
    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public float getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(float larghezza) {
        this.larghezza = larghezza;
    }

    public double printingombro(){
        double ingombro = larghezza*altezza;
        return ingombro;
    }
}
