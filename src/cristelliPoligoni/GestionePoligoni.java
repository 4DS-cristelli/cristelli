package cristelliPoligoni;

public class GestionePoligoni {
    private PoligonoRegolare[] IP;
    private int dimLogica;

    public GestionePoligoni(int dimFisica)throws Exception{
        if(dimFisica<=0){
            throw new Exception("dimFisica <= 0");
        }
        IP = new PoligonoRegolare[dimFisica];
        dimLogica = 0;
    }

    public void addPoligono(PoligonoRegolare p1)throws Exception{
        if(dimLogica< IP.length){
            throw new Exception("dim esaurita");
        }
    }


}
