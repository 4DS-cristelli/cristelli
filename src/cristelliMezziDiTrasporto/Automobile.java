package cristelliMezziDiTrasporto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import cristelliPrenotazione.Persona;

import javax.swing.event.MenuKeyListener;


public class Automobile extends MezzoDiTrasporto{
    private ArrayList passeggeri;

    Automobile(){
        super();
        passeggeri = new ArrayList<Persona>();
    }
    Automobile(String marca,Integer cavalli) throws Exception {
        super(marca,cavalli);
        passeggeri = new ArrayList<Persona>();
    }

    public ArrayList getPasseggeri(){
        return new ArrayList<Persona>(passeggeri);
    }

    public void setPasseggeri(ArrayList<Persona> passeggeri)throws Exception{
        if(passeggeri.size()<=4) {
            this.passeggeri = new ArrayList<>(passeggeri);
        }else{
            throw new Exception("Passeggeri >4");
        }
    }

    public void aggiungiPasseggero(Persona passeggero)throws Exception{
        if(passeggeri.size()+1 <= 4){
            passeggeri.add(passeggero);
        }else{
            throw new Exception("Passeggeri >4");
        }
    }

    public void rimuoviUltimoPasseggero(){
        passeggeri.removeLast();
    }

    public void rimuoviPasseggero(Persona passeggero)throws Exception{
        if(!passeggeri.remove(passeggero)){
            throw new Exception("Passeggero inesistente");
        }
    }

    public void ordinaPasseggeriCrescente() {
        Collections.sort(passeggeri);
    }

    public void ordinaPasseggeriDecrescente() {
        Collections.sort(passeggeri);
        Collections.reverse(passeggeri);
    }


    @Override
    public String toString() {
        String stringa = "";
        stringa = stringa+ passeggeri.toString();
        return stringa;
    }
}
