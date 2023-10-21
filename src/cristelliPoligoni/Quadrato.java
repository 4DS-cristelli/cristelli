package cristelliPoligoni;
import java.lang.Math;


public class Quadrato extends PoligonoRegolare{
    Quadrato(float lato)throws Exception{
        super(lato, 4);
    }

    public double Area(){
        double Area = getLato()*getLato();
        return Area;
    }
    public double Diagonale(){
        double diagonale = Math.sqrt(((Math.pow(getLato(),2))*2));
        return diagonale;
    }

}
