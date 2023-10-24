package cristelliPoligoni;

public class testPoligoni {
    public static void main(String[] args) {
        GestionePoligoni gp1 = null;
        Rombo r1 = null;
        PoligonoRegolare p1 = null;
        PoligonoRegolare p2 = null;
        PoligonoRegolare p3 = null;

        try {
            gp1 = new GestionePoligoni(4);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //quadrato
        try {
            p1 = new PoligonoRegolare(10, 4);

            Quadrato p5 = new Quadrato(48f);



        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        //rombo
        try {
            r1 = new Rombo(10,10,10 );
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //pentagono
        try {
            p2 = new PoligonoRegolare(10, 5);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //esagono
        try {
            p3 = new PoligonoRegolare(10, 6);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            gp1.addPoligono(p1);
            gp1.addPoligono(r1);
            gp1.addPoligono(p2);
            gp1.addPoligono(p3);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(gp1.Area(0));

        }catch (Exception e){
        }

        try{
            System.out.println("Perimetro 1: "+gp1.Perimetro(0));
            System.out.println("Perimetro 2: "+gp1.Perimetro(1));
            System.out.println("Perimetro 3: "+gp1.Perimetro(2));
            System.out.println("Perimetro 4: "+gp1.Perimetro(3));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n"+ gp1.toString());

        //test aggregazione lasca
        try{
            p1.setLato(20);
            p2.setLato(20);
            p3.setLato(20);
            r1.setLato(20);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Perimetro 1: "+gp1.Perimetro(0));
            System.out.println("Perimetro 2: "+gp1.Perimetro(1));
            System.out.println("Perimetro 3: "+gp1.Perimetro(2));
            System.out.println("Perimetro 4: "+gp1.Perimetro(3));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("");
        try{
            System.out.println(gp1.toString(0));
            System.out.println(gp1.toString(1));
            System.out.println(gp1.toString(2));
            System.out.println(gp1.toString(3));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
