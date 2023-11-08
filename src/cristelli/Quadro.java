package cristelli;

public class Quadro extends Operadarte {
    private float altezza;
    private float larghezza;

    public Quadro(String titolo, String artista, float altezza, float larghezza)throws Exception{
        super(titolo, artista);
        setAltezza(altezza);
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

    public double printingombro(){
        double ingombro = larghezza*altezza;
        return ingombro;
    }

    public String toString(){
        String stringa= "";
        stringa = "Quadro"+ " Artista: "+getArtista()+" Titolo: "+getTitolo()+" altezza: "+altezza+"  larghezza: "+larghezza;
        return stringa;
    }
}
