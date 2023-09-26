package cristelliCerchio;
import cristelliSegmento.Punto;

import java.util.Scanner;
public class cerchioTest {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        float x;
        float y;
        float r;
        float perc;
        Cerchio c1 = null;

        System.out.println("Inserisci la x del centro: ");
        x= input.nextByte();
        System.out.println("Inserisci la y del centro: ");
        y= input.nextByte();

        System.out.println("Inserisci il raggio: ");
        r= input.nextByte();

        Punto p1 = new Punto(x, y);


        try{
            c1 = new Cerchio(p1, r);
        }catch (Exception e){
            System.out.println(e);
        }



        System.out.println("Rappresentazione del cerchio: "+ c1.toString());

        System.out.println("Il centro è: " + c1.getCentro().toString());

        System.out.println("Il raggio è: "+ c1.getRaggio());

        System.out.println("Inserisci percentuale della nuova dimensione: ");
        perc= input.nextByte();
        c1.modificaGrandezzaPercentuale(perc);
        System.out.println("Rappresentazione del cerchio: "+ c1.toString());

        System.out.println("Inserisci la nuova x del centro 1: ");
        x= input.nextByte();
        System.out.println("Inserisci la nuova y del centro 1: ");
        y= input.nextByte();
        c1.setCentro(new Punto(x,y));

        System.out.println("Inserisci il nuovo raggio: ");
        r= input.nextByte();
        try{
            c1.setRaggio(r);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
