package org.java.gestione_viaggi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

//MILESTONE 3
//Creare una classe Concerto che estende Evento, che ha anche gli attributi :
//● ora: LocalTime
//● prezzo: BigDecimal
//Aggiungere questi attributi nel costruttore e implementarne getter e setter Aggiungere i
// metodi per restituire data e ora formattata e prezzo formattato (##,##€)
//Fare l’ override del metodo toString() in modo che venga restituita una stringa del
// tipo: data e ora formattata - titolo - prezzo formattato
public class Concert extends Event {
    private LocalTime schedule;
    BigDecimal price;


    public Concert(String title, int numSeats, int numReservedSeats, LocalDate date, LocalTime schedule, BigDecimal price) {
        super(title, numSeats, numReservedSeats, date);
        this.schedule = schedule;

        this.price = price;
    }

    public LocalTime getSchedule() {
        return schedule;
    }

    public void setSchedule(LocalTime schedule) {
        this.schedule = schedule;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    private String getFormattedSchedule() {
        return schedule.toString();

    }

    private LocalDate getFormattedDate(LocalDate date) {
        return getDate();
    }

    public String getFormattedPrice() {
        return String.format("%.2f€", price);
    }

    @Override
    public String toString() {
        return "data e ora: " + getFormattedDate(getDate()) + " alle " + getFormattedSchedule() +  " del " + getTitle() + " al prezzo di " + getPrice();
    }
}


