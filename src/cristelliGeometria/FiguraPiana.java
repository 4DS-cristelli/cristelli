package cristelliGeometria;

public abstract class FiguraPiana extends FiguraGeometrica{

    public FiguraPiana(String colore)throws Exception{
        super(colore);
    }

    public abstract double calcolaPerimetro();

    public abstract double calcolaArea();

}
