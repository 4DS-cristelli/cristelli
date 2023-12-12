package cristelliGeometria;


public abstract class FiguraGeometrica {

    private String colore;

    public FiguraGeometrica(String colore) throws Exception{
        setColore(colore);
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) throws Exception {
        if (colore != null) {
            if (colore != "") {
                this.colore = colore;
            } else {
                throw new Exception("Colore vuoto");
            }
        } else {
            throw new Exception("Colore null");
        }
    }

        @Override
        public String toString() {
            return "FiguraGeometrica{" +
                    "Colore='" + colore + '\'' +
                    '}';
        }
}