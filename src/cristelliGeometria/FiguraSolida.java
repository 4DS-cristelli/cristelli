package cristelliGeometria;

public abstract class FiguraSolida extends FiguraPiana{ //problema: figura soliada is a figura piana non funziona dovrebbe ereditare da figura geometrica
    public FiguraSolida(String colore) throws Exception {
        super(colore);
    }

    public abstract double calcolaVolume();


    public abstract double calcolaSuperficie();

    @Override
    public String toString() {
        return "FiguraSolida{}";
    }
}
