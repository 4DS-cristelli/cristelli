package cristelli;

public class Scultura extends Operadarte {
    protected float altezza;
    protected float larghezza;
    protected float profondita;

    protected Supporto s1;


    public Scultura(String titolo, String artista, float altezza, float larghezza, float profondita, Supporto s1)throws Exception{
        super(titolo, artista);
        setAltezza(altezza);
        setProfondita(profondita);
        setLarghezza(larghezza);
        this.s1 = new Supporto(s1);


    }

    public float getAltezza() {
        return altezza;
    }

    private void setAltezza(float altezza)throws Exception{
        if(altezza>0){
            this.altezza = altezza;
        }else{
            throw new Exception("Altezza sbagliata");
        }

    }


    public float getLarghezza() {
        return larghezza;
    }

    private void setLarghezza(float larghezza)throws Exception{
        if(larghezza>0){
            this.larghezza = larghezza;
        }else{
            throw new Exception("Larghezza sbagliata");
        }
    }

    public float getProfondita() {
        return profondita;
    }

    private void setProfondita(float profondita)throws Exception{
        if(profondita>0){
            this.profondita = profondita;
        }else{
            throw new Exception("Profondità sbagliata");
        }
    }

    double printingombro() {
        double ingombro = altezza*larghezza*profondita;
        ingombro = ingombro + s1.printingombro();
        return ingombro;
    }
    public String toString(){
        String stringa= "";
        stringa = "Scultura"+ " Artista: "+getArtista()+" Titolo: "+getTitolo()+" altezza: "+altezza+"  larghezza: "+larghezza+" profondità "+profondita + " "+ s1.toString();
        return stringa;
    }
}
