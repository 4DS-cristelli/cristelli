package cristelleMele;
import java.util.Random;
import java.util.Scanner;
import cristelliData.*;

public class testMele {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        GestioneRaccolto gr1 = null; //dichiaro l'oggetto
        boolean uscita = false;
        boolean flag;
        int scelta = -1;
        int sceltaOra = -1;

        //variabili temporanee
        int i = 0;
        int dimLogicaArraySopraTot = 0;
        int giorno= 0;
        int mese = 0;
        int anno = 0;
        int dim = 0;
        float quintali = 0;
        Data dataTmp = null;
        Data dataTmp2 = null;
        Raccolto raccoltoTmp = null;
        try{
             dataTmp2 = new Data(1,1,2021);
        }catch (Exception e){
            System.out.println(e);
        }
        try{
             raccoltoTmp = new Raccolto(dataTmp2, 0);
        }catch (Exception e){
            System.out.println(e);
        }



        do{//ciclo input selezione con eccezzioni
            try{
                input = new Scanner(System.in);
                System.out.print("Inserisci la grandezza del magazzino:  ");
                dim = input.nextInt();
                gr1 = new GestioneRaccolto(dim); //istanzio l'oggetto
                flag = true;
            }catch(Exception e){
                System.out.println(e.getMessage());
                flag = false;
            }
        }while(!flag);

        do{
            System.out.println("CLASSE MELE");
            System.out.println("0. esci");
            System.out.println("1. inserisci un raccolto");
            System.out.println("2. visualizza il magazzino");
            System.out.println("3. raccolto massimo");
            System.out.println("4. raccolto medio");
            System.out.println("5. raccolto totale");
            System.out.println("6. Quintali in data");
            System.out.println("7. raccolti sopra tot");


            do{//ciclo input selezione con eccezzioni
                try{
                    input = new Scanner(System.in);
                    System.out.print("Inserisci la scelta:  ");
                    scelta = input.nextInt();
                    flag = true;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    flag = false;
                }
            }while(!flag);

            switch (scelta){
                case 0:
                    uscita = true;
                    break;
                case 1:
                    //creo una data tmp
                    do{//ciclo input selezione con eccezzioni
                        try{
                            input = new Scanner(System.in);
                            System.out.print("Inserisci il giorno:  ");
                            giorno = input.nextInt();
                            flag = true;
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                            flag = false;
                        }
                    }while(!flag);

                    do{//ciclo input selezione con eccezzioni
                        try{
                            input = new Scanner(System.in);
                            System.out.print("Inserisci il mese:  ");
                            mese = input.nextInt();
                            flag = true;
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                            flag = false;
                        }
                    }while(!flag);

                    do{//ciclo input selezione con eccezzioni
                        try{
                            input = new Scanner(System.in);

                            System.out.print("Inserisci l'anno:  ");
                            anno = input.nextInt();
                            flag = true;
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                            flag = false;
                        }
                    }while(!flag);

                    do{//ciclo input selezione con eccezzioni
                        try{
                            input = new Scanner(System.in);

                            System.out.print("Inserisci i quintali:  ");
                            quintali = input.nextByte();
                            flag = true;
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                            flag = false;
                        }
                    }while(!flag);
                    try {
                         dataTmp = new Data(giorno,mese,anno);
                         gr1.setRaccolto(dataTmp, quintali);
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println(gr1.toString());
                    break;
                case 3:
                    try{
                        raccoltoTmp =  gr1.massimaRaccolta();
                        //printo il l'oggeto contenente il masimo raccolto
                        System.out.println("Giornata massimo raccolto: "+raccoltoTmp.toString());
                    }catch (Exception e){
                        System.out.println(e);
                    }
                   break;

                case 4:
                    System.out.println("Media raccolto: "+gr1.raccoltaMediaGiornaliera());

                    break;
                case 5:
                    System.out.println("Totale raccolto: "+gr1.totRaccolta());
                    break;

                case 6:

                    //creo una data tmp da passare
                    do{//ciclo input selezione con eccezzioni
                        try{
                            input = new Scanner(System.in);

                            System.out.print("Inserisci il giorno:  ");
                            giorno = input.nextInt();
                            flag = true;
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                            flag = false;
                        }
                    }while(!flag);

                    do{//ciclo input selezione con eccezzioni
                        try{
                            input = new Scanner(System.in);
                            System.out.print("Inserisci il mese:  ");
                            mese = input.nextInt();
                            flag = true;
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                            flag = false;
                        }
                    }while(!flag);

                    do{//ciclo input selezione con eccezzioni
                        try{
                            input = new Scanner(System.in);

                            System.out.print("Inserisci l'anno:  ");
                            anno = input.nextInt();
                            flag = true;
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                            flag = false;
                        }
                    }while(!flag);

                    try {
                        dataTmp = new Data(giorno,mese,anno);
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    try{
                        quintali = gr1.quintaliData(dataTmp);
                        System.out.println("In data: "+dataTmp.toString()+" sono stati raccolti: "+quintali+" quintali");
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    break;

                case 7:
                    Raccolto[] arrayGiornateSopraTot = new Raccolto[gr1.getNumGiornate()];
                    do{//ciclo input selezione con eccezzioni
                        try{
                            input = new Scanner(System.in);
                            System.out.print("Inserisci il limite dei quintali:  ");
                            quintali = input.nextInt();
                            flag = true;
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                            flag = false;
                        }
                    }while(!flag);
                    try{
                        dimLogicaArraySopraTot =gr1.giornateSopraTot(quintali,arrayGiornateSopraTot);
                    }catch (Exception e){
                        System.out.println(e);
                    }
                    for(i = 0; i<dimLogicaArraySopraTot; i++){
                        System.out.println(arrayGiornateSopraTot.toString()+"\n");
                    }
            }
            System.out.println("\n\n");
        }while (!uscita);//ciclo finche uscita non diventa true
        System.out.println("ARRIVEDERCI");

    }
}
