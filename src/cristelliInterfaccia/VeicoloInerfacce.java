package cristelliInterfaccia;

public class VeicoloInerfacce implements Confrontatore{
    private float vMax;

    public VeicoloInerfacce(float vmax)throws Exception{
        setvMax(vmax);
    }

    public float getvMax() {
        return vMax;
    }

    public void setvMax(float vMax)throws Exception{
        if(vMax >0){
            this.vMax = vMax;
        }else{
            throw new Exception("Vmax errata");
        }
    }

    @Override
    public String toString() {
        return "VeicoloInerfacce{" +
                "vMax=" + vMax +
                '}';
    }


    @Override
    public Boolean confrontaUguale(Confrontatore confrontabile) {
        boolean uguale = false;
        if(confrontabile instanceof VeicoloInerfacce){
            if(getvMax()==((VeicoloInerfacce) confrontabile).getvMax()){
                uguale = true;
            }
        }
        return uguale;
    }
    @Override
    public Boolean confrontaMaggiore(Confrontatore confrontabile) {
        boolean uguale = false;
        if(confrontabile instanceof VeicoloInerfacce){
            if(getvMax()>((VeicoloInerfacce) confrontabile).getvMax()){
                uguale = true;
            }
        }
        return uguale;
    }
    @Override
    public Boolean confrontaMinore(Confrontatore confrontabile) {
        boolean uguale = false;
        if(confrontabile instanceof VeicoloInerfacce){
            if(getvMax()<((VeicoloInerfacce) confrontabile).getvMax()){
                uguale = true;
            }
        }
        return uguale;
    }
}
