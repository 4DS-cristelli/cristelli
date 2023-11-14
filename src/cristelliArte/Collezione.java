package cristelliArte;

public class Collezione {
    private String nome;
    private String luogo;
    private Operadarte[] opere;
    private int dimlogica;

    public Collezione(String nome, String luogo, int dim)throws Exception{
        if(dim<=0){
            throw new Exception("dim errata");
        }
        else{
            setLuogo(luogo);
            setNome(nome);
            opere = new Operadarte[dim];
            for(int i = 0; i<dim; i++){
                opere[i] = null;
            }
            dimlogica = 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public void addOpera(Operadarte opera)throws Exception{
        if(opera == null){
            throw new Exception("Opera nulla");
        }
        if(dimlogica>= opere.length){
            throw new Exception("dim esaurita");
        }
        opere[dimlogica]= opera;
        dimlogica++;
    }

    public double ingombro(int pos)throws Exception{
        double ingombro;
        if(pos<0 || pos>= opere.length){
            throw new Exception("Pos errata");
        }
        if(opere[pos]== null){
            throw new Exception("Posione vuota");
        }
        ingombro = opere[pos].printingombro();
        return ingombro;

    }


    public boolean equals(Operadarte op, int pos)throws Exception{
        boolean uguali = false;
        if(pos<0 || pos>= opere.length){
            throw new Exception("Pos errata");
        }
        if(opere[pos]== null){
            throw new Exception("Posione vuota");
        }

        if(opere[pos].equals(op)){
            uguali = true;
        }
        return uguali;
    }

    public String toString(){
        String stringa = "";
        stringa = stringa+"Nome collezione: "+ nome+" Luogo collezione: "+luogo+ "\n";
        for(int i =0; i<dimlogica;i++){
            stringa=stringa+opere[i].toString()+"\n";
        }
        return stringa;
    }
}
