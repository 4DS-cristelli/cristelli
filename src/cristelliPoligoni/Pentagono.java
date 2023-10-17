package cristelliPoligoni;
import java.lang.Math;
public class Pentagono extends PoligonoRegolare{
    Pentagono(float lato)throws Exception{
        super(lato, 5);
    }

    public double Area(){
        double Area = (Math.pow(getLato(),2)*1.72);
        return Area;
    }
    public double Apotema(){
        double apotema = getLato()*0.688;
        return apotema;
    }
}
