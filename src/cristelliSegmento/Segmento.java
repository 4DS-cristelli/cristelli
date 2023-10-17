package cristelliSegmento;
import java.lang.Math;
public class Segmento {
    private PuntoSegmento puntoSegmento1;
    private PuntoSegmento puntoSegmento2;

    public Segmento(PuntoSegmento p1, PuntoSegmento p2)throws Exception{
        if(confrontaPunti(p1, p2)){
            throw new Exception("punti sovrapposti");
        }
        this.puntoSegmento1 = new PuntoSegmento(p1);
        this.puntoSegmento2 = new PuntoSegmento(p2);

    }
    public PuntoSegmento getPunto1(){
        PuntoSegmento pRet = new PuntoSegmento(this.puntoSegmento1);
        return pRet;
    }

    public PuntoSegmento getPunto2(){
        PuntoSegmento pRet = new PuntoSegmento(this.puntoSegmento2);
        return pRet;
    }

    public void setPunto1(PuntoSegmento p1){
        //punto1 = new Punto(p1);
        puntoSegmento1.setX(p1.getX());
        puntoSegmento1.setY(p1.getY());
    }

    public void setPunto2(PuntoSegmento p2){
        puntoSegmento2.setX(p2.getX());
        puntoSegmento2.setY(p2.getY());
    }

    public String toString(){
        String str = "";
        str = str+ this.puntoSegmento1.toString()+this.puntoSegmento2.toString();
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
        distanza = Math.sqrt((Math.pow(puntoSegmento2.getX()- puntoSegmento1.getX(),2)+Math.pow(puntoSegmento2.getY()- puntoSegmento1.getY(),2)));
        return distanza;
    }

    public void traslaSegmento(float x, float y){
        puntoSegmento1.traslaX(x);
        puntoSegmento2.traslaX(x);
        puntoSegmento1.traslaY(y);
        puntoSegmento2.traslaY(y);
    }
    public boolean confrontaPunti(PuntoSegmento p1, PuntoSegmento p2){
        boolean uguali = false;
        if(p1.getX()== p2.getX() && p1.getY()== p2.getY()){
            uguali = true;
        }
        return uguali;
    }
}
