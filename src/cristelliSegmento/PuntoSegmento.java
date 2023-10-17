
package cristelliSegmento;
public class PuntoSegmento {
    float x;
    float y;

    public PuntoSegmento(float x, float y){
        this.x = x;
        this.y = y;
    }

    public PuntoSegmento(PuntoSegmento p1){
        this.x = p1.x;
        this.y = p1.y;
    }

    public void setX(float x){
        this.x = x;
    }

    public void setY(float y){
        this.y = x;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public String toString(){
        String str= "";
        str = str +"("+ x +" , " + y+")";
        return str;
    }

    public void traslaX(float traslaX){
        x = x+traslaX;
    }

    public void traslaY(float traslaY){
        y = y+traslaY;
    }




}
