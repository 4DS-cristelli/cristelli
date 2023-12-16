package cristelliGeometria;
import java.lang.Math;
public class Cerchio extends FiguraGeometrica implements PoligonoRegolare{
    private float raggio;
    public Cerchio(String colore, float raggio) throws Exception {
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
    public double calcolaPerimetro() {
        return raggio*2*3.14;
    }

    @Override
    public double calcolaArea() {
        return 3.14*(Math.pow(raggio,2));
    }

    @Override
    public double calcolaApotema() {
        return raggio*0.289;
    }

    @Override
    public String toString() {
        return "Cerchio{" +
                "raggio=" + raggio +
                '}';
    }
}
