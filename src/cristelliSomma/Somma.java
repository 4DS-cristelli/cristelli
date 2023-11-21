package cristelliSomma;

/**
 * Somma tra due numeri interi
 * @author eric.cristelli
 * @version 1.0
 */

public class Somma {
    private Integer n1;
    private Integer n2;

    /**
     * Costruttore senza parametri
     */
    public Somma(){

    }

    /**
     * @param n1
     * @param n2
     */
    public Somma(Integer n1, Integer n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Integer getN1() {
        return n1;
    }

    /**
     *
     * @param n1
     */
    public void setN1(Integer n1) {
        this.n1 = n1;
    }

    /**
     *
     * @return
     */
    public Integer getN2() {
        return n2;
    }

    /**
     *
     * @param n2
     */
    public void setN2(Integer n2) {
        this.n2 = n2;
    }

    /**
     *
     * @return
     */
    public String toString(){
        return "n1: " + n1+" n2: "+n2;
    }
    /**
     * stringa
     */
}
