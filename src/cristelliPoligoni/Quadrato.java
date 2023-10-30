package cristelliPoligoni;
import java.lang.Math;


public class Quadrato extends PoligonoRegolare{
    Quadrato(float lato)throws Exception{
        super(lato, 4);
    }

    public double area(){
        double area = getLato()*getLato();
        return area;
    }
    public double diagonale(){
        double diagonale = Math.sqrt(((Math.pow(getLato(),2))*2));
        return diagonale;
    }

}
