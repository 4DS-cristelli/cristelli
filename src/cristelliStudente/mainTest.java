package cristelliStudente;

import jdk.internal.cmm.SystemResourcePressureImpl;

public class mainTest {
    public static void main(String[] args) {
        Studente s1 = null;
        try{
            s1 = new Studente("Ciccio Eric    ", "Prova");

        }catch (ArithmeticException e){
            System.out.println("divisione per 0");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("|" + s1.getNome() + "|");
    }
}
