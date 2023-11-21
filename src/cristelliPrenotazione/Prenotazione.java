package cristelliPrenotazione;

public class Prenotazione {
    private Persona persona1;
    private String data;
    private String ora;

    public Prenotazione(Persona persona1, String data, String ora) throws Exception{
        setPersona1(persona1);
        setData(data);
        setOra(ora);
    }

    public Persona getPersona1() throws Exception {
        return new Persona(persona1);
    }

    public void setPersona1(Persona persona1)throws Exception {
        if(persona1 == null){
            throw new Exception("Persona a null");
        }
        this.persona1 = new Persona(persona1);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception{
        if(data == null){
            throw new Exception("Data a null");
        }
        data = data.trim();
        if(data.contains((" "))){
            throw new Exception("Spazi tra le cifre");
        }
        if(!data.contains("-")){
            throw new Exception("Formato sbagliato");
        }
        try{
            String[] array= data.split("-");
            Integer gg = Integer.valueOf(array[0]);
            Integer mm = Integer.valueOf(array[1]);
            Integer aaaa = Integer.valueOf(array[2]);
            if(controlloData(gg,mm,aaaa)){
                this.data = data;
            }
        }catch (NullPointerException e){
            throw new NullPointerException();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora)throws Exception{
        if(ora == null){
            throw new Exception("Ora a null");
        }
        ora = ora.trim();
        if(ora.contains((" "))){
            throw new Exception("Spazi tra le cifre");
        }
        if(!ora.contains(":")){
            throw new Exception("Formato sbagliato");
        }

        try{
            String[] array= ora.split(":");
            Integer ore = Integer.valueOf(array[0]);
            Integer minuti = Integer.valueOf(array[1]);
            Integer secondi = Integer.valueOf(array[2]);
            if(controlloOra(ore,minuti,secondi)){
                this.ora = ora;
            }
        }catch (NullPointerException e){
            throw new NullPointerException();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    private boolean controlloOra(int ore, int minuti, int secondi)throws Exception{
        if(ore>=0 && ore<=23){
            if(minuti>=0 &&minuti<=59){
                if(secondi>=0 &&secondi<=59){

                }else{
                    throw new Exception("Secondi sbagliati");
                }
            }else{
                throw new Exception("Minuti sbagliati");
            }
        }else{
            throw new Exception("Ore sbagliate");
        }
        return true;
    }

    private boolean controlloData(int giorno, int mese, int anno)throws Exception{
        boolean corretta = false;
        int[] mesi = {31, 28,31, 30, 31,30,31,31,30,31,30,31};
        int[] mesiBisestile = {31, 29,31, 30, 31,30,31,31,30,31,30,31};

        if(controlloBisestile(anno)){
            if(mese>=1 &&mese<=12){
                if(giorno >= 1 &&giorno<=mesiBisestile[mese-1]){
                    corretta = true;
                }else{
                    throw new Exception("giorno sbagliato");
                }
            }else{
                throw new Exception("mese sbagliato");
            }
        }else{
            if(mese>=1 &&mese<=12){
                if(giorno >= 1 &&giorno<=mesi[mese-1]){
                    corretta = true;
                }else{
                    throw new Exception("giorno sbagliato");
                }
            }else{
                throw new Exception("mese sbagliato");
            }
        }
        return corretta;
    }

    private boolean controlloBisestile(int anno){
        boolean bisestile = false;
        if(anno%4 == 0){
            bisestile = true;
        }
        return bisestile;
    }

    @Override
    public String toString() {
        String stringa;
        stringa = persona1.toString() + ", " + data + ", ora"+ ora;
        return stringa;
    }
}
