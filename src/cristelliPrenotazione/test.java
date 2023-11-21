package cristelliPrenotazione;



public class test {
    public static void main(String[] args) {




        //test classe Persona
        Persona p1 = null;
        Persona p2 = null;
        try {
            p2 = new Persona("Cristelli", "Eric","ASSMRC95M16H224T","2-2-2006", "eric@cristelli.com");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            p1 = new Persona("Cristelli", "Maria Beatrice","ASSMRC95M16H224T","2-2-2006", "eric@cristelli.com");
            System.out.println(p1.toString());
            p1.setNome("Eric");
            System.out.println(p1.toString());
            System.out.println("le persone sono omonime?: "+ p1.verificaOmonimia(p2));
            p1.setNome("Marià Beatrice");
            System.out.println("Sono presenti: "+p1.getNumeroIstanze()+" Instanze");

            System.out.println("Eta "+ p1.getNome()+": "+ p1.calcolaEta());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            Prenotazione pr1 = new Prenotazione(p1, "2-2-2021", "22:1:00");
            System.out.println(pr1.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
