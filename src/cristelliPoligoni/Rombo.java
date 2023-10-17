package cristelliPoligoni;

public class Rombo extends PoligonoRegolare{
    private float dMaggiore;
    private float dMinore;

    public Rombo(float dMin, float dMax, float l)throws Exception{
        super(l,4);
        setdMaggiore(dMax);
        setdMinore(dMin);
    }

    public void setdMaggiore(float dMaggiore) {
        this.dMaggiore = dMaggiore;
    }

    public void setdMinore(float dMinore) {
        this.dMinore = dMinore;
    }

    public float getdMaggiore() {
        return dMaggiore;
    }

    public float getdMinore() {
        return dMinore;
    }

    public float Area(){
        float area = (dMaggiore*dMinore)/2;
        return area;
    }

    public String toString(){
        String stringa = "";
        stringa = super.toString()+ " dMaggiore: "+ dMaggiore +" dMinore: "+ dMinore;
        return stringa;
    }


}
