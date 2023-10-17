package cristelliCerchio;
import cristelliSegmento.PuntoSegmento;
import java.lang.Math;
public class Cerchio {
    private PuntoSegmento centro;
    private float raggio;

    public Cerchio(PuntoSegmento c, float r)throws Exception{
        if(r<=0){
            throw new Exception("raggio errato");
        }else{
            raggio = r;
        }
        centro = new PuntoSegmento(c);
    }

    public String toString(){
        String str = "";
        str = str+ "("+ raggio +" , "+ centro.toString()+")";
        return str;
    }
    public void setCentro(PuntoSegmento p1){
        centro= new PuntoSegmento(p1);
    }

    public void setRaggio(float r)throws Exception{
        if(r<=0){
            throw new Exception("raggio errato");
        }else{
            raggio = r;
        }
    }

    public PuntoSegmento getCentro(){
//return c= new Punto(this.centro);
        return new PuntoSegmento(centro);
    }

    public float getRaggio(){
        return raggio;
    }

    public void modificaGrandezzaPercentuale(float perc){
        float tmpR = 0;
        tmpR = ((raggio*perc)/100);
        raggio = raggio + tmpR;
    }

    public double calcolaArea(){
        double area = 3.14*(Math.pow(raggio,2));
        return area;
    }

    public double calcolaPerimetro(){
        double perimetro = 3.14*2*raggio;
        return perimetro;
    }
}
