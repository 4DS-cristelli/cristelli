package riempiDB;
import java.time.LocalDate;

import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class DBContatto {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Random random = new Random();
        LocalDate dataCasuale;
        String randomTime;
        String[] listaNomi = {
                "Mario", "Luigi", "Francesca", "Giovanni", "Maria", "Alessia", "Roberto", "Laura", "Paolo", "Elisa",
                "Marco", "Giulia", "Andrea", "Sara", "Luca", "Chiara", "Davide", "Martina", "Simone", "Valentina",
                "Fabio", "Elena", "Stefano", "Federica", "Giacomo", "Giorgia", "Massimo", "Cristina", "Matteo", "Veronica"
        };

        String[] listaCognomi = {
                "Rossi", "Russo", "Ferrari", "Esposito", "Bianchi", "Romano", "Colombo", "Ricci", "Marino", "Greco",
                "Bruno", "Gallo", "Conti", "De Luca", "Mancini", "Costa", "Giordano", "Rizzo", "Lombardi", "Moretti",
                "Barbieri", "Fontana", "Santoro", "Mariani", "Rinaldi", "Caruso", "Ferrara", "Galli", "Martini", "Leone"
        };

        System.out.print("Inserisci quante persone vuoi inserire: ");
        int n;
        n = input.nextInt();
        String stringa;

        try {
            FileWriter myWriter = new FileWriter("C:\\files\\query.txt");
            for(int i= 0;i<n;i++){
                stringa = "INSERT INTO CONTATTO VALUES (";
                int nomeRandom = random.nextInt(30);
                int cognomeRandom = random.nextInt(30);
                dataCasuale = generaDataCasuale();
                randomTime = generateRandomTime();
                boolean diplomato = random.nextBoolean();
                stringa+= listaNomi[nomeRandom]+","+listaCognomi[cognomeRandom]+","+dataCasuale+","+randomTime+","+diplomato+")\n";
                myWriter.write(stringa);
            }
            myWriter.close();
            System.out.println("Fatto");
        } catch (IOException e) {
            System.out.println("Errore");
            e.printStackTrace();
        }

    }

    public static LocalDate generaDataCasuale() {
        long inizio = LocalDate.of(1970, 1, 1).toEpochDay();
        long fine = LocalDate.of(2023, 12, 31).toEpochDay();
        long giornoCasuale = ThreadLocalRandom.current().nextLong(inizio, fine);
        return LocalDate.ofEpochDay(giornoCasuale);
    }
    public static String generateRandomTime() {
        Random random = new Random();
        int hours = random.nextInt(24);
        int minutes = random.nextInt(60);
        int sec = random.nextInt(60);

        String time = "";
        time += hours+":"+minutes+":"+sec;
        return time;
    }
}
