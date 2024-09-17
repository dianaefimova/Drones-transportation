package fi.sade23.web.dronsStation.fleet.drone;

import java.util.concurrent.atomic.AtomicLong;

public class Flight {

    private static final AtomicLong counter = new AtomicLong(0);

    private final long id;
    private String destination;
    private String estimatedTimeOfArrival;

    public Flight() {
        this.id = counter.incrementAndGet(); 
    }

    public long getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getEstimatedTimeOfArrival() {
        return estimatedTimeOfArrival;
    }

    public void setEstimatedTimeOfArrival(String eta) {
        this.estimatedTimeOfArrival = eta;
    }

}

