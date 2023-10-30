package cristelliPoligoni;

public class GestionePoligoni {
    private PoligonoRegolare[] IP;
    private int dimLogica;

    public GestionePoligoni(int dimFisica)throws Exception{
        if(dimFisica<=0){
            throw new Exception("dimFisica <= 0");
        }
        IP = new PoligonoRegolare[dimFisica];
        for(int i=0; i<dimFisica;i++){
            IP[i] = null;
        }
        dimLogica = 0;
    }

    public void addPoligono(PoligonoRegolare p1)throws Exception{
        if(p1 == null){
            throw new Exception("Poligono nullo");
        }
        if(dimLogica>= IP.length){
            throw new Exception("dim esaurita");
        }
        IP[dimLogica]= p1;
        dimLogica++;
    }

    public double Area(int i)throws Exception{
        double area= 0;
        if(i>=0 && i<= IP.length){
            if(IP[i]!= null){
               // area = IP[i].
            }else{
                throw new Exception("Pos i == null");
            }
        }else{
            throw new Exception("valore di i sbagliato");
        }
     return area;
    }

    public float Perimetro(int i)throws Exception{
        float perimetro;
        if(i>=0 && i<= IP.length){
            if(IP[i]!= null){
                perimetro = IP[i].Perimetro();
            }else{
                throw new Exception("Pos i == null");
            }
        }else{
            throw new Exception("valore di i sbagliato");
        }
        return perimetro;
    }

    public String toString(){
        String stringa = "";
        for(int i = 0; i<dimLogica; i++){
            stringa = stringa + IP[i].toString()+"\n";
        }
        return stringa;
    }

    public String toString(int i)throws Exception{
        String stringa = "";
        if(i>=0 && i<= IP.length){
            if(IP[i]!= null){
                stringa = IP[i].toString();
            }else{
                throw new Exception("Pos i == null");
            }
        }else{
            throw new Exception("valore di i sbagliato");
        }
        return stringa;
    }


}
