package cristelliInterfaccia;

abstract class PoligonoRegolareInterfacce implements Confrontatore{
    private float lato;
    private int nLati;
    private static int nIstanze;

    public PoligonoRegolareInterfacce(float l, int n)throws Exception{
        setLato(l);
        setnLati(n);
        nIstanze++;
    }

    public void setLato(float l) throws Exception {
        if(l<=0){
            throw new Exception("Lato <= 0");
        }
        this.lato = l;
    }
    public void setnLati(int n) throws Exception {
        if(n<=2 || n>6){
            throw new Exception("n <= 2 o n>6");
        }
        this.nLati =n;
    }
    public float getLato() {
        return lato;
    }
    public int getnLati() {
        return nLati;
    }

    public static int getnIstanze() {
        return nIstanze;
    }

    public float Perimetro(){
        float p = lato*nLati;
        return p;
    }
    abstract double area();

    public String toString(){
        String stringa = "";
        stringa = stringa + "Nlati: "+ nLati+" Lato: "+lato;
        stringa = stringa + " nIstanze: "+nIstanze;
        return stringa;
    }

    @Override
    public Boolean confrontaUguale(Confrontatore confrontabile) {
        boolean uguale = false;
        if(confrontabile instanceof PoligonoRegolareInterfacce){
            if(area()==((PoligonoRegolareInterfacce) confrontabile).area()){
                uguale = true;
            }
        }
        return uguale;
    }
    @Override
    public Boolean confrontaMaggiore(Confrontatore confrontabile) {
        boolean uguale = false;
        if(confrontabile instanceof PoligonoRegolareInterfacce){
            if(area()>((PoligonoRegolareInterfacce) confrontabile).area()){
                uguale = true;
            }
        }
        return uguale;
    }
    @Override
    public Boolean confrontaMinore(Confrontatore confrontabile) {
        boolean uguale = false;
        if(confrontabile instanceof PoligonoRegolareInterfacce){
            if(area()<((PoligonoRegolareInterfacce) confrontabile).area()){
                uguale = true;
            }
        }
        return uguale;
    }
}