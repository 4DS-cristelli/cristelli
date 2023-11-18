package cristelli;

public class SculturaDeperibile extends Scultura {
    private int eta;
    private String materiale;
    private int deperibilitaMateriale;

    public SculturaDeperibile(String titolo, String artista, float altezza, float larghezza, float profondita, int eta, String materiale, int deperibilita, Supporto s1)throws Exception{
        super(titolo, artista, altezza, larghezza, profondita, s1);
        setEta(eta);
        setMateriale(materiale);
        setDeperibilitaMateriale(deperibilita);

    }

    public void setEta(int eta)throws Exception{
        if(eta <= 0){
            throw new Exception("Eta invalida");
        }else{
            this.eta = eta;
        }
    }
    private void setMateriale(String materiale){
        this.materiale = materiale;
    }

    private void setDeperibilitaMateriale(int deperibilitaMateriale)throws Exception{
        if(deperibilitaMateriale>= 1 && deperibilitaMateriale <= 10){
            this.deperibilitaMateriale = deperibilitaMateriale;
        }else{
            throw new Exception("Deperibilità incorretta");
        }
    }

    public int getEta() {
        return eta;
    }

    public String getMateriale() {
        return materiale;
    }

    public int getDeperibilitaMateriale() {
        return deperibilitaMateriale;
    }

    double printingombro(){
        double ingombro = altezza*larghezza*profondita;
        if(ingombro-calcolaCoefficenteDeperibilita()<= 0){
            ingombro = 0;
        }else{
            ingombro = ingombro -calcolaCoefficenteDeperibilita();
        }
        ingombro = ingombro + s1.printingombro();
        return ingombro;
    }

    private float calcolaCoefficenteDeperibilita(){
        int coefficente;
        coefficente = eta*deperibilitaMateriale;
        coefficente = coefficente*10;
        return coefficente;
    }




}
