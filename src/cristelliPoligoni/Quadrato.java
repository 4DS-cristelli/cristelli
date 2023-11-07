package cristelliPoligoni;
import java.lang.Math;


public class Quadrato extends PoligonoRegolare{
    Quadrato(float lato)throws Exception{
        super(lato, 4);
    }

    public double area(){
        double area = getLato()*getLato();
        return area;
    }
    public double diagonale(){
        double diagonale = Math.sqrt(((Math.pow(getLato(),2))*2));
        return diagonale;
    }

    public String disegna(){
        int tmp = (int) getLato();
        char carattere = '#';
        String stringa ="";
        int i;
        int j;
        for(i=0; i<tmp; i++){
            if(i==0 || i== tmp-1) {
                for (j = 0; j < tmp; j++) {
                    stringa = stringa + carattere;
                }
                stringa = stringa + "\n";

            }else{
                    stringa= stringa+carattere;
                    for(j=1;j<tmp-1;j++){
                        stringa = stringa + " ";
                    }
                    stringa = stringa + carattere+ "\n";
                }
            }
            return stringa;
        }

        public String toString(){
        String stringa = "Quadrato";
        stringa+= " Lato: "+getLato();
        return stringa;
    }

}
