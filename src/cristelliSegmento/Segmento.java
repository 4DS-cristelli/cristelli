package cristelliSegmento;
import java.lang.Math;
public class Segmento {
    private Punto punto1;
    private Punto punto2;

    public Segmento(Punto p1, Punto p2)throws Exception{
        if(confrontaPunti(p1, p2)){
            throw new Exception("punti sovrapposti");
        }
        this.punto1= new Punto(p1);
        this.punto2= new Punto(p2);

    }
    public Punto getPunto1(){
        Punto pRet = new Punto(this.punto1);
        return pRet;
    }

    public Punto getPunto2(){
        Punto pRet = new Punto(this.punto2);
        return pRet;
    }

    public void setPunto1(Punto p1){
        //punto1 = new Punto(p1);
        punto1.setX(p1.getX());
        punto1.setY(p1.getY());
    }

    public void setPunto2(Punto p2){
        punto2.setX(p2.getX());
        punto2.setY(p2.getY());
    }

    public String toString(){
        String str = "";
        str = str+ this.punto1.toString()+this.punto2.toString();
        return str;
    }

    public double calcolaDistanzaPunti(){
        double distanza = 0;
        /*
        float tmp3 = (punto2.getX()-punto1.getX());
        double tmp4 = Math.pow(tmp3, 2);

        float tmp5 = (punto2.getY()-punto1.getY());
        double tmp6 = Math.pow(tmp5, 2);

        //double tmp1 = ((punto1.getX()-(punto2.getX())*((punto1.getX())-(punto2.getX())));
        //double tmp1 = Math.pow(punto1.getX()-(punto2.getX()),2);
        //double tmp2 = Math.pow(punto1.getY()-(punto2.getY()),2);
        distanza = Math.sqrt(tmp4+tmp6);
        */
        distanza = Math.sqrt((Math.pow(punto2.getX()-punto1.getX(),2)+Math.pow(punto2.getY()-punto1.getY(),2)));
        return distanza;
    }

    public void traslaSegmento(float x, float y){
        punto1.traslaX(x);
        punto2.traslaX(x);
        punto1.traslaY(y);
        punto2.traslaY(y);
    }
    public boolean confrontaPunti(Punto p1, Punto p2){
        boolean uguali = false;
        if(p1.getX()== p2.getX() && p1.getY()== p2.getY()){
            uguali = true;
        }
        return uguali;
    }
}
