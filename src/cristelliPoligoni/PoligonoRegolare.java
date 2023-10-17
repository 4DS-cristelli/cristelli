package cristelliPoligoni;
public class PoligonoRegolare {
    private float lato;
    private int nLati;

    public PoligonoRegolare(float l, int n)throws Exception{

        setLato(l);
        setnLati(n);
    }

    public void setLato(float l) throws Exception {
        if(l<=0){
            throw new Exception("Lato <= 0");
        }
        this.lato = l;
    }
    public void setnLati(int n) throws Exception {
        if(n<=2){
            throw new Exception("n <= 2");
        }
        this.nLati =n;
    }
    public float getLato() {
        return lato;
    }
    public int getnLati() {
        return nLati;
    }

    public float Perimetro(){
        float p = lato*nLati;
        return p;
    }

    public String toString(){
        String stringa = "";
        stringa = stringa + "Nlati: "+ nLati+" Lato: "+lato;
        return stringa;
    }
}

