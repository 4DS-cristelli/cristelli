package cristelliPoligoni;
import java.lang.Math;
public class Pentagono extends PoligonoRegolare{
    Pentagono(float lato)throws Exception{
        super(lato, 5);
    }

    public double area(){
        double Area = (Math.pow(getLato(),2)*1.72);
        return Area;
    }
    public double apotema(){
        double apotema = getLato()*0.688;
        return apotema;
    }
    public String toString(){
        String stringa = "Pentagono";
        stringa+= " Lato: "+getLato();
        return stringa;
    }
}
