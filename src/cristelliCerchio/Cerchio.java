package cristelliCerchio;
import cristelliSegmento.Punto;
import java.lang.Math;
public class Cerchio {
    private Punto centro;
    private float raggio;

    public Cerchio(Punto c, float r)throws Exception{
        if(r<=0){
            throw new Exception("raggio errato");
        }else{
            raggio = r;
        }
        centro = new Punto(c);
    }

    public String toString(){
        String str = "";
        str = str+ "("+ raggio +" , "+ centro.toString()+")";
        return str;
    }
    public void setCentro(Punto p1){
        centro= new Punto(p1);
    }

    public void setRaggio(float r)throws Exception{
        if(r<=0){
            throw new Exception("raggio errato");
        }else{
            raggio = r;
        }
    }

    public Punto getCentro(){
//return c= new Punto(this.centro);
        return new Punto(centro);
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
