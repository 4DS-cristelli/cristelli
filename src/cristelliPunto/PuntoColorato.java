package cristelliPunto;

public class PuntoColorato extends Punto {
    private String colore;

    public PuntoColorato(float x, float y, String colore) {
        // l’istruzione seguente è la chiamata del costruttore della classe “madre”
        super(x, y);
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public String toString() {
        return super.toString() +" colore: " +colore;
    }
}
