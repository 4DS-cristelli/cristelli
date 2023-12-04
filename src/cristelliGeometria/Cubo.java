package cristelliGeometria;
import java.lang.Math;
public class Cubo extends FiguraSolida{
    private float lato;

    public Cubo(String colore, float lato) throws Exception {
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
    public double calcolaSuperficie() {
        double superficie;
        superficie = (Math.pow(lato,2)*6);
        return superficie;
    }

    @Override
    public double calcolaVolume() {
        return Math.pow(lato,3);
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "lato=" + lato +
                '}';
    }

    @Override
    public double calcolaPerimetro() {
        return 0;
    }

    @Override
    public double calcolaArea() {
        return 0;
    }
}
