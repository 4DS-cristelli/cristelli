package cristelliAerodromo;

public abstract class Aeromobile implements CMP{
    private String sigla;

    public Aeromobile(String sigla)throws Exception{
        setSigla(sigla);
    }

    public String getSigla() {
        return sigla;
    }

    private void setSigla(String sigla)throws Exception{
        if(sigla != null){
            if(!sigla.equals("")){
                this.sigla = sigla;
            }else{
                throw new Exception("Sigla vuota");
            }
        }else{
            throw new Exception("Sigla a null");
        }
    }

    @Override
    public abstract Boolean superioreAeromobile(Aeromobile a1); //domandare come si può implementare il metodo cmp nella classe madre di Aliante e AeroMotore

    public abstract Boolean equals(Aeromobile a1);

    public String toString(){
        String stringa = "";
        stringa = stringa +"Aeromobile, Sigla: " +sigla;
        return stringa;
    }
}
