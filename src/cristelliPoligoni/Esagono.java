package cristelliPoligoni;

public class Esagono extends PoligonoRegolare{
    Esagono(float lato)throws Exception{
        super(lato, 6);
    }

    public double Area(){
        double Area = Perimetro()*Apotema()/2;
        return Area;
    }
    public double Apotema(){
        double apotema = getLato()*0.866;
        return apotema;
    }
}
