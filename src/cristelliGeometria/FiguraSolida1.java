package cristelliGeometria;

public abstract class FiguraSolida1 extends FiguraGeometrica { //problema: figura soliada is a figura piana non funziona dovrebbe ereditare da figura geometrica
    public FiguraSolida1(String colore) throws Exception {
        super(colore);
    }

    public abstract double calcolaVolume();


    public abstract double calcolaSuperficie();

    @Override
    public String toString() {
        return "FiguraSolida{}";
    }

    public abstract double calcolaPerimetro();

    public abstract double calcolaArea();
}
