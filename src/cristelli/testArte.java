package cristelli;

public class testArte {
    public static void main(String[] args) {
        Collezione cl1 = null;
        Quadro q1 = null;
        Quadro q2 = null;
        Scultura s1 = null;

        try{
            cl1 = new Collezione("mart", "Rovereto", 3);
            q1 = new Quadro("luce", "Eric", 10 ,10);
            q2 = new Quadro("luce", "Eric", 10 ,10);
            s1 = new Scultura("notte", "Franco", 10 ,10,10);

            cl1.addOpera(q1);
            cl1.addOpera(s1);
            System.out.println(cl1.toString());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        //test aggregazione lasca(modifico l'istanza q1 e s1
        //q1.setArtista("Marco");
        s1.setTitolo("stelle");
        System.out.println(cl1.toString());

        //test metodi ovveride
        try{
            System.out.println("Ingombro q1:" + cl1.ingombro(0));
            System.out.println("Ingombro s1:" + cl1.ingombro(3));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("q1 e q2 sono ugali? "+ cl1.equals(q2,0 ));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
