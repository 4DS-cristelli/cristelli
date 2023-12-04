package cristelliGeometria;
import java.lang.Math;
public class Sfera extends FiguraSolida{
    private float raggio;

    public Sfera(String colore, float raggio) throws Exception {
        super(colore);
        setRaggio(raggio);
    }

    public float getRaggio() {
        return raggio;
    }

    public void setRaggio(float raggio)throws Exception{
        if(raggio>0){
            this.raggio = raggio;
        }else{
            throw new Exception("Raggio <=0");
        }
    }

    @Override
    public double calcolaSuperficie() {
        double superficie;
        superficie = 4*3.14*(Math.pow(raggio,2));
        return superficie;
    }

    @Override
    public double calcolaVolume() {
        return (4*3.14*(Math.pow(raggio,3)))/3;
    }

    @Override
    public String toString() {
        return "Sfera{" +
                "raggio=" + raggio +
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
