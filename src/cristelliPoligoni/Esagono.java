package cristelliPoligoni;

public class Esagono extends PoligonoRegolare{
    Esagono(float lato)throws Exception{
        super(lato, 6);
    }

    public double area(){
        double Area = Perimetro()*apotema()/2;
        return Area;
    }
    public double apotema(){
        double apotema = getLato()*0.866;
        return apotema;
    }
    public String toString(){
        String stringa = "Esagono ";
        stringa+= " Lato: "+getLato();
        return stringa;
    }
}
