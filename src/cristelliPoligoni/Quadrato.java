package cristelliPoligoni;
import java.lang.Math;


public class Quadrato extends PoligonoRegolare{
    Quadrato(float lato)throws Exception{
        super(lato, 4);
    }

    public float Area(){
        float Area = getLato()*getLato();
        return Area;
    }
    public double Diagonale(){
        double diagonale = Math.sqrt(((Math.pow(getLato(),2))*2));
        return diagonale;
    }

}
