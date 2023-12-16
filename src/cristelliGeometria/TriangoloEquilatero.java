package cristelliGeometria;
import java.lang.Math;
public class TriangoloEquilatero extends FiguraGeometrica implements PoligonoRegolare{
    private float lato;
    public TriangoloEquilatero(String colore, float lato) throws Exception {
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
        return lato*3;
    }

    @Override
    public double calcolaArea() {
        return (lato*calcolaAltezza())/2;
    }

    @Override
    public double calcolaApotema() {
        double apotema;
        apotema = (Math.sqrt(3)/2)*lato;
        return apotema;
    }

    public double calcolaAltezza(){
        double altezza;
        altezza = Math.sqrt((lato*lato)-((lato/2)*(lato/2)));
        return altezza;
    }

    @Override
    public String toString() {
        return "TriangoloEquilatero{" +
                "lato=" + lato +
                '}';
    }
}
