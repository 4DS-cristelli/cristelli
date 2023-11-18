package cristelliArte;

public class Quadro extends Operadarte{
    private float altezza;
    private float larghezza;

    private Cornice c1;

    public Quadro(String titolo, String artista, float altezza, float larghezza, Cornice c1)throws Exception{
        super(titolo, artista);
        setAltezza(altezza);
        setLarghezza(larghezza);
        if(c1.verificaFimensioni(larghezza, altezza)){
            this.c1 = new Cornice(c1);
        }else{
           throw new Exception("conice Sbagliata");
        }
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
        ingombro = ingombro+ c1.printingombro();
        return ingombro;
    }

    public String toString(){
        String stringa= "";
        stringa = "Quadro"+ " Artista: "+getArtista()+" Titolo: "+getTitolo()+" altezza: "+altezza+"  larghezza: "+larghezza+" "+c1.toString();
        return stringa;
    }
}
