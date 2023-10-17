package cristelliPunto;

public class testPunto {
    public static void main(String[] args) {
        Punto p1 = new Punto(10,10);
        PuntoColorato p2 = new PuntoColorato(20,20,"giallo");
        Punto3D p3 = new Punto3D(30,30,30);

        System.out.println("Punto p1: "+p1.toString());
        System.out.println("Punto p2: "+p2.toString());
        System.out.println("Punto p3: "+p3.toString());
        System.out.println("");
        p1.shift(1,1);
        p2.shift(1,1);
        p3.shift(1,1);
        System.out.println("Punto p1: "+p1.toString());
        System.out.println("Punto p2: "+p2.toString());
        System.out.println("Punto p3: "+p3.toString());
    }
}
