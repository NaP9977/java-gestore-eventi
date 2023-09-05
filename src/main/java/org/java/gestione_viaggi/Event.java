package org.java.gestione_viaggi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//MILESTONE 1
//La consegna è di creare una classe Evento che abbia le seguenti proprietà:
//● titolo
//● data
//● numero di posti in totale
//● numero di posti prenotati
//Quando si istanzia un nuovo evento questi attributi devono essere tutti
// valorizzati nel costruttore , tranne posti prenotati che va inizializzato a 0.
//Inserire il controllo che la data non sia già passata e che il numero di
// posti totali sia positivo. In caso contrario sollevare opportune eccezioni.
//Aggiungere metodi getter e setter in modo che:
//● titolo sia in lettura e in scrittura
//● data sia in lettura e scrittura
//● numero di posti totale sia solo in lettura
//● numero di posti prenotati sia solo in lettura
//Vanno inoltre implementati dei metodi public che svolgono le seguenti funzioni:
//1. prenota : aggiunge un certo numero di posti prenotati.
// Se l’evento è già passato o non ha posti disponibili deve sollevare un’eccezione.
//2. disdici : riduce di un certo numero i posti prenotati.
// Se l’evento è già passato o non ci sono prenotazioni deve sollevare un’eccezione.
//3. l’override del metodo toString() in modo che venga restituita una stringa contenente:
// data formattata - titolo
//Aggiungete eventuali metodi (public e private) che vi aiutino a svolgere le funzioni richieste.
public class Event {
    private String title;
    private LocalDate date;
    private int numSeats;
    private int numReservedSeats;

    public Event(String title, int numSeats, int numReservedSeats, LocalDate date) {
        this.title = title;
        isDateValid(date);
        this.date = date;
        isValidNum(numSeats);
        this.numSeats = numSeats;
        noReservations(numReservedSeats);
        this.numReservedSeats = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getNumReservedSeats() {
        return numReservedSeats;
    }
public int reservation (){
        return numReservedSeats++;
}

public int cancellation (){
        return numReservedSeats--;
}

public int minusSeats(){
        return numSeats--;
}
public void noReservations(int numReservedSeats){
        if(numReservedSeats == 0){
            throw new RuntimeException();
        }
}
    private void isValidNum(int numSeats){
        if(numSeats < 0){
            throw new RuntimeException();
        }
    }
    private void isDateValid(LocalDate date){
        if(date.isBefore(LocalDate.now())){
            throw new RuntimeException();
        }
    }

    @Override
    public String toString() {
        return "l'evento: " + title + " che si svolgerà in data " + date.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
