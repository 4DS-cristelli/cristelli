package cristelliOra;

public class Ora {
    //attributo
    private int secondi;
    //metodi
    Ora(int sec,int min, int ore)throws Exception{
        //controlli
        if(ore<0 || ore >23){
            throw new Exception("ore sbagliate");
        }
        if(min <0|| min>59){
            throw new Exception("min sbagliati");
        }
        if(sec <0|| sec>59){
            throw new Exception("sec sbagliati");
        }

        //convertisco l'ora insecondi
        secondi = secondi +(ore*3600);
        secondi = secondi +(min*60);
        secondi = secondi +sec;

        //se eccedo il giorno
        if(secondi >=86400){
            secondi = secondi-86400;
        }
    }

    public String toString(){
        String stringa = "";
        int ore;
        int min;
        int sec;
        //converto ora min e sec
        ore = (secondi/3600);
        min = ((secondi-ore*3600)/60);
        sec = ((secondi -ore*3600)-min*60);

        stringa = stringa +ore+":"+min+":"+sec;
        return stringa;
    }

    public int getSecondi(){
        return secondi;
    }

    public void setOraCompleta(int sec,int min, int ore)throws Exception{
        //controlli
        if(ore<0 || ore >23){
            throw new Exception("ore sbagliate");
        }
        if(min <0|| min>59){
            throw new Exception("min sbagliati");
        }
        if(sec <0|| sec>59){
            throw new Exception("sec sbagliati");
        }

        //convertisco l'ora insecondi
        secondi = secondi +(ore*3600);
        secondi = secondi +(min*60);
        secondi = secondi +sec;

        //se eccedo il giorno
        if(secondi >=86400){
            secondi = secondi-86400;
        }
    }


    //mezzanotte = 86400 sec
    public int secAMezzanotte(){
        return 86400-secondi;
    }
    public int minAMezzanotte(){
        int tmp = 0;
        tmp = ((86400-secondi)/60);
        return tmp;
    }
    public int oreAMezzanotte(){
        int tmp = 0;
        tmp = ((86400-secondi)/3600);
        return tmp;
    }

    public int secDaMezzanotte(){
        return secondi;
    }
    public int minDaMezzanotte(){
        int tmp = 0;
        tmp = (secondi)/60;
        return tmp;
    }
    public int oreDaMezzanotte(){
        int tmp = 0;
        tmp = ((secondi)/3600);
        return tmp;
    }

    public void aggiungiSec(int sec)throws Exception{
        if(sec<0){
            throw new Exception("nun megativo ");
        }
        secondi = secondi+sec;
        //se eccedo il giorno
        if(secondi >=86400){
            secondi = secondi-86400;
        }
    }

    public void aggiungimin(int min)throws Exception{
        if(min<0){
            throw new Exception("nun megativo");
        }
        secondi = secondi+(min*60);
        //se eccedo il giorno
        if(secondi >=86400){
            secondi = secondi-86400;
        }
    }
    public void aggiungiore(int ore)throws Exception{
        if(ore<0){
            throw new Exception("nun megativo");
        }
        secondi = secondi+(ore*3600);
        //se eccedo il giorno
        if(secondi >=86400){
            secondi = secondi-86400;
        }
    }
}
