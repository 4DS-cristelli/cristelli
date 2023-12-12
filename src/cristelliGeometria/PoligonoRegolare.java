package cristelliGeometria;

public interface PoligonoRegolare {

    double calcolaPerimetro();

    double calcolaArea();

    public default double calcolaApotema(){
        return 0;
    }
}
