package cristelliSegmento;
import java.util.Scanner;

public class puntoRettaTest {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        float x;
        float y;
        Segmento s1 = null;

        System.out.println("Inserisci la x del punto 1: ");
        x= input.nextByte();
        System.out.println("Inserisci la y del punto 1: ");
        y= input.nextByte();

        Punto p1 = new Punto(x, y);


        System.out.println("Inserisci la x del punto 2: ");
        x= input.nextByte();

        System.out.println("Inserisci la y del punto 2: ");
        y= input.nextByte();
        Punto p2 = new Punto(x, y);


        try{
            s1 = new Segmento(p1, p2);
        }catch (Exception e){
            System.out.println(e);
        }



        System.out.println("Rappresentazione del segmento: "+ s1.toString());

        System.out.println("La distanza tra i 2 punti è di: " + s1.calcolaDistanzaPunti());

        System.out.println("Rappresentazione del punto 1: "+ s1.getPunto1().toString());

        System.out.println("Rappresentazione del punto 2: "+ s1.getPunto2().toString());

        System.out.println("Inserisci la traslazione x del segmento: ");
        x= input.nextByte();
        System.out.println("Inserisci la traslazione y del segmento: ");
        y= input.nextByte();

        s1.traslaSegmento(x,y);

        System.out.println("Rappresentazione del segmento: "+ s1.toString());


        System.out.println("Inserisci la nuova x del punto 1: ");
        x= input.nextByte();
        System.out.println("Inserisci la nuova y del punto 1: ");
        y= input.nextByte();

        s1.setPunto1(new Punto(x,y));


        System.out.println("Inserisci la nuova x del punto 2: ");
        x= input.nextByte();

        System.out.println("Inserisci la nuova y del punto 2: ");
        y= input.nextByte();
        s1.setPunto2(new Punto(x,y));

        System.out.println("Rappresentazione del segmento: "+ s1.toString());



    }
}
