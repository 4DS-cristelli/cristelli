package cristelliPunto;

public class Punto3D extends Punto {
    private float z;

    public Punto3D(float x, float y, float z) {
        // come nella classe precedente, il metodo super serve per chiamare il costruttore
        // della classe madre
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    //esempio di polimorfismo: ho lo stesso metodo che svolge la stessa azione con
    // lo stesso nome di quello della classe madre con un attributo in più
    public void shift(float dx, float dy, float dz) {
        shift(dx, dy);
        this.z += dz;
    }

    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
