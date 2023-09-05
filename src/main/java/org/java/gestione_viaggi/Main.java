package org.java.gestione_viaggi;

import java.time.LocalDate;
import java.util.Scanner;

//1. Creare una classe Main di test, in cui si chiede all’utente di
// inserire un nuovo evento con tutti i parametri.
//2. Dopo che l’evento è stato istanziato, chiedere all’utente se e quante prenotazioni vuole
// fare e provare ad effettuarle, implementando opportuni controlli e gestendo eventuali eccezioni.
//3. Stampare a video il numero di posti prenotati e quelli disponibili
//4. Chiedere all’utente se e quanti posti vuole disdire
//5. Provare ad effettuare le disdette, implementando opportuni controlli e
// gestendo eventuali eccezioni
//6. Stampare a video il numero di posti prenotati e quelli disponibili
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Benvenuto nella sezione prenotazioni eventi");
        System.out.println("Vuoi prenotare un evento?(s/n)");
        String risposta = scan.nextLine().toLowerCase();
        boolean doYouWantTo = false;
        if (risposta.equals("s".toLowerCase())) {
            doYouWantTo = true;
        } else if (risposta.equals("n".toLowerCase())) {
            System.out.println("Va bene allora arrivederci!");
            doYouWantTo = false;
        }

        while (doYouWantTo) {
            try {
                System.out.println("Quanti posti vuoi prenotare?");
                int reservedSeats = Integer.parseInt(scan.nextLine());
                Event event = new Event("Concerto di natale", 700, reservedSeats, LocalDate.of(2023, 12, 25));
                for (int i = 0; i < reservedSeats; i++) {
                    event.reservation();
                    event.minusSeats();
                    continue;
                }
                System.out.println("Hai prenotato " + event.getNumReservedSeats() + " per " + event.toString());
                System.out.println("Posti ancora disponibili +" + event.getNumSeats());

            }

            catch (RuntimeException e) {
                System.out.println("Dati inseriti non validi");
            }


        }
        scan.close();
    }
}

