package cristelliPoligoni;

public class testPoligoni {
    public static void main(String[] args) {
        PoligonoRegolare pl1;
        PoligonoRegolare pl2;
        PoligonoRegolare pl3;
        PoligonoRegolare pl4;

        Quadrato q1 = null;
        Rombo r1 = null;
        Esagono e1 = null;
        Pentagono p1= null;
        try{
            q1 = new Quadrato(10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            r1 = new Rombo(10,10,10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            e1 = new Esagono(10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }try{
            p1 = new Pentagono(10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        pl1 = q1;
        pl2 = r1;
        pl3 = e1;
        pl4 = p1;

        System.out.println(q1.disegna());
        System.out.println(r1.disegna());
        GestionePoligoni gp1 = null;

        try {
            gp1 = new GestionePoligoni(4);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            gp1.addPoligono(pl1);
            gp1.addPoligono(pl2);
            gp1.addPoligono(pl3);
            gp1.addPoligono(pl4);
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
            pl1.setLato(20);
            pl2.setLato(20);
            pl3.setLato(20);
            pl4.setLato(20);
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





        /*
        PoligonoRegolare pl1;
        PoligonoRegolare pl2;
        PoligonoRegolare pl3;
        PoligonoRegolare pl4;

        Quadrato q1 = null;
        Rombo r1 = null;
        Esagono e1 = null;
        Pentagono p1= null;
        try{
            q1 = new Quadrato(10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            r1 = new Rombo(10,10,10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            e1 = new Esagono(10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }try{
            p1 = new Pentagono(10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        pl1 = q1;
        pl2 = r1;
        pl3 = e1;
        pl4 = p1;


        System.out.println(pl1.toString() + " Area "+pl1.area()+ " Perimetro "+ pl1.Perimetro());
        System.out.println(pl2.toString()+ " Area "+pl2.area()+ " Perimetro "+ pl2.Perimetro());
        System.out.println(pl3.toString()+ " Area "+pl3.area()+ " Perimetro "+ pl3.Perimetro());
        System.out.println(pl4.toString()+ " Area "+pl4.area()+ " Perimetro "+ pl4.Perimetro());

*/







    }
}
