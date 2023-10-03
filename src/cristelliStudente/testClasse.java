package cristelliStudente;

import java.lang.reflect.Array;
import java.util.Arrays;

public class testClasse {
    public static void main(String[] args) {
        Studente[] arrS;
        arrS= new Studente[3];
        Studente s1 = null;
        Studente s2 = null;
        Classe cl1 = null;
        String n;
        String c;

        try{
            arrS[0] = new Studente(null, "cRiS teLlI");
            arrS[1] = new Studente("frA nCeS    co    ", "roS si");
            arrS[2] = new Studente("Lu ca", "ro ss   i");
             s1 = new Studente("faBio", "r omboli");
        }catch (Exception e){
            System.out.println(e);
        }

        try{
             cl1 = new Classe(s1, arrS);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.print("toString classe: ");
        System.out.println(cl1.toString());

        Studente[] cl2 = cl1.getStudenti();
        System.out.print("toString array studenti returnati: ");
        System.out.println(Arrays.toString(cl2));
        try{
            cl2[0].setCognome("test");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.print("toString array cl2 dopo mondifica del cognome: ");
        System.out.println(Arrays.toString(cl2));//test aggregazione stretta (se modifico l'array returnato non si modifica anche cl1)
        System.out.print("toString array cl1 dopo mondifica cl2: ");
        System.out.println(cl1.toString());
        try{
            s2 = new Studente("paolo","cri ste lli");
            cl1.setCapoClasse(s2);
            cl1.invertiAttributi();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.print("toString cl1 invertiti nome e cognome e con capo classe diverso: ");
        System.out.println(cl1.toString());
    }
}
