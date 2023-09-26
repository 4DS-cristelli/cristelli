package cristelliStudente;

import java.lang.reflect.Array;
import java.util.Arrays;

public class testClasse {
    public static void main(String[] args) {
        Studente arrS[];
        arrS= new Studente[3];
        Studente s1 = null;
        Studente s2 = null;
        Classe cl1 = null;
        try{
            arrS[0] = new Studente("eric", "cRiS teLlI");
            arrS[1] = new Studente("MARC", "cRiS teLlI");
            arrS[2] = new Studente("Lu ca", "cRiS  teLlI");
             s1 = new Studente("faBio", "r omboli");
        }catch (Exception e){
            System.out.println(e);
        }

        try{
             cl1 = new Classe(s1, arrS);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(cl1.toString());

        Studente[] cl2 = cl1.getStudenti();
        System.out.println(Arrays.toString(cl2));
        cl2[0].setCognome("test");
        System.out.println(cl1.toString());

        try{
            s2 = new Studente("paolo","cri ste lli");
            cl1.invertiAttributi();

        }catch (Exception e){
            System.out.println(e);
        }
        cl1.setCapoClasse(s2);
        System.out.println(cl1.toString());
    }
}
