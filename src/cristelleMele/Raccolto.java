package cristelleMele;

import cristelliData.Data;

public class Raccolto {

    private float quintali;
    private Data data;
    public Raccolto(Data data, float quintali) throws Exception {
        if(quintali < 0) {
            throw new Exception("\nNumero quintali non valido.");
        }
        this.data = data;
        this.quintali = quintali;
    }
    public String toString() {
        String str = "";
        str = "In data " + this.data + " sono stati raccolti " + this.quintali + " quintali.";
        return str;
    }
    public float getQuintali() {
        return quintali;
    }
    public Data getData() {
        return data;
    }
    public void setQuintali(float quint){
        this.quintali = quint;
    }
}

