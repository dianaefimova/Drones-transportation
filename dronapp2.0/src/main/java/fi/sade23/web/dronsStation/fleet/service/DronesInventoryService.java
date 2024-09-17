package fi.sade23.web.dronsStation.fleet.service;

import org.springframework.stereotype.Service;

import fi.sade23.web.dronsStation.fleet.drone.Drone;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class DronesInventoryService {

    private final List<Drone> droneInventory = new CopyOnWriteArrayList<>();

    public List<Drone> getAllDrones() {
        return droneInventory;
    }

    public Drone addDrone(Drone drone) {
        droneInventory.add(drone);
        return drone;
    }

    public Drone updateDrone(long id, Drone droneDetails) {
        droneInventory.replaceAll(drone -> {
            if (drone.getId() == id) { 
                drone.setStatus(droneDetails.getStatus());
               
            }
            return drone;
        });
        return droneDetails;
    }

    public void deleteDrone(long id) {
        droneInventory.removeIf(drone -> drone.getId() == id); 
    }
}
