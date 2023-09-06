package org.java.gestione_viaggi;

import java.time.LocalDate;
import java.util.*;

public class EventsPLanning {
    private String title;
    private List<Event> events;

    public EventsPLanning(String title) {
        this.title = title;
        this.events = new ArrayList<>();
    }

    public String addTitle(String title) {
        return title;
    }

    public void addEvent (Event event){
        events.add(event);
    }

    public List eventsWithTheSameDate(LocalDate date) {
        List<Event> eventsInDate = new ArrayList<>();
        for (Event event : events) {
            if (event.getDate().isEqual(date)) {
                eventsInDate.add(event);
            }
        }
            return eventsInDate;
        }

    public int numEvents(){
        return events.size();
    }
    public void clear(){
        events.clear();
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
       string.append("Gli eventi in programma sono: ").append(title).append("\n");
       for(Event event : events){
           string.append(event).append("\n");}
       return string.toString();
       }
    }





