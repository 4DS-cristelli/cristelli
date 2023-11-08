package cristelli;

public class Scultura extends Operadarte {
    private float altezza;
    private float larghezza;
    private float profondita;

    public Scultura(String titolo, String artista, float altezza, float larghezza, float profondita)throws Exception{
        super(titolo, artista);
        setAltezza(altezza);
        setProfondita(profondita);
        setLarghezza(larghezza);

    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza)throws Exception{
        if(altezza>0){
            this.altezza = altezza;
        }else{
            throw new Exception("Altezza sbagliata");
        }

    }

    public float getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(float larghezza)throws Exception{
        if(larghezza>0){
            this.larghezza = larghezza;
        }else{
            throw new Exception("Larghezza sbagliata");
        }
    }

    public float getProfondita() {
        return profondita;
    }

    public void setProfondita(float profondita)throws Exception{
        if(profondita>0){
            this.profondita = profondita;
        }else{
            throw new Exception("Profondità sbagliata");
        }
    }

    double printingombro() {
        double ingombro = altezza*larghezza*profondita;
        return ingombro;
    }
    public String toString(){
        String stringa= "";
        stringa = "Scultura"+ " Artista: "+getArtista()+" Titolo: "+getTitolo()+" altezza: "+altezza+"  larghezza: "+larghezza+" profondità "+profondita;
        return stringa;
    }
}
