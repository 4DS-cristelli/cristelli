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

    public double area(){
        double area = (dMaggiore*dMinore)/2;
        return area;
    }

    public String disegna() {
        String rombo= "";
        int dMagg = (int) dMaggiore;
        char carattere = '#';


        if (dMagg % 2 == 0) {
            dMagg++; // Se la dimensione massima è un numero pari, aumentalo di 1 per avere una dimensione dispari.
        }

        // Parte superiore del rombo
        for (int i = 0; i < dMagg; i++) {
            for (int j = 0; j < dMagg - i; j++) {
                rombo = rombo +" ";
            }
            for (int j = 0; j <= i; j++) {
                rombo = rombo+ carattere+ " ";
            }
            rombo = rombo+"\n";
        }

        // Parte inferiore del rombo
        for (int i = (int)dMagg - 2; i >= 0; i--) {
            for (int j = 0; j < dMagg - i; j++) {
                rombo = rombo+" ";
            }
            for (int j = 0; j <= i; j++) {
                rombo = rombo+ carattere+ " ";
            }
            rombo = rombo+"\n";
        }

        return rombo.toString();
    }

    public String toString(){
        String stringa = "Rombo ";
        stringa+=  " dMaggiore: "+ dMaggiore +" dMinore: "+ dMinore;
        return stringa;
    }


}
