package fi.sade23.web.dronsStation.fleet.drone;

import java.util.concurrent.atomic.AtomicLong;

public class Drone {

    private static final AtomicLong counter = new AtomicLong(0);

    private final long id;
    private String status;

    public Drone() {
        this.id = counter.incrementAndGet(); 
    }

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}

