package cristelliGeometria;
import java.lang.Math;

public class Quadrato extends FiguraPiana implements PoligonoRegolare{
    private float lato;

    public Quadrato(String colore, float lato) throws Exception {
        super(colore);
        setLato(lato);
    }

    public float getLato() {
        return lato;
    }

    public void setLato(float lato)throws Exception{
        if(lato>0){
            this.lato = lato;
        }else{
            throw new Exception("Lato a 0");
        }
    }

    @Override
    public double calcolaPerimetro() {
        return lato*4;
    }

    @Override
    public double calcolaArea() {
        return (lato*lato);
    }

    @Override
    public double calcolaApotema() {
        return lato/2;
    }

    public double calcolaDiagonale(){
        double diagonale;
        diagonale = Math.sqrt((Math.pow(lato, 2)*2));
        return diagonale;
    }

    @Override
    public String toString() {
        return "Quadrato{" +
                "lato=" + lato +
                '}';
    }
}
