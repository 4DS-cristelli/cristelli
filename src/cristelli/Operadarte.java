package cristelli;

abstract class Operadarte {
    protected String titolo;
    protected String artista;

    public Operadarte(String titolo, String artista) {
        this.titolo = titolo;
        this.artista = artista;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    abstract double printingombro();

    public boolean equals(Operadarte op){
        boolean uguali = false;
        if(op.getArtista().equals( this.artista) && op.titolo.equals(this.titolo)){
            uguali = true;
        }
        return uguali;
    }


    public String toString() {
        return "Operadarte{" +
                "titolo='" + titolo + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}
