package cristelliMezziDiTrasporto;

public class MezzoDiTrasporto {

    private final Float COEFF_CONV_DA_CV_A_KW = (float)0.73;
    private Integer cavalli;
    private String marca;

    protected static int numeroIstanze = 0;

    MezzoDiTrasporto(){
        cavalli = null;
        marca = null;
        numeroIstanze++;
    }
    MezzoDiTrasporto(String marca, Integer cavalli)throws Exception{
        setCavalli(cavalli);
        setMarca(marca);
    }

    public Integer getCavalli() {
        return cavalli;
    }
    public String getMarca() {
        return marca;
    }

    public void setCavalli(Integer cavalli)throws Exception{
        if(cavalli>0){
            this.cavalli = cavalli;
        }else{
            throw new Exception("Cavalli <0");
        }

    }

    public void setMarca(String marca)throws Exception{
        if(marca.length()>= 3){
            marca.toUpperCase();
            this.marca = marca;
        }
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public double calcolaKW(){
        return cavalli*COEFF_CONV_DA_CV_A_KW;
    }

    public String info()throws Exception{
        if(marca!=null && cavalli!=null){
            String stringa = "";
            stringa = stringa + "Marca: "+marca;
            stringa = stringa + " Cavalli: "+cavalli;
            return stringa;
        }else{
            throw new Exception("Dati non del tutto inseriti");
        }
    }

}
