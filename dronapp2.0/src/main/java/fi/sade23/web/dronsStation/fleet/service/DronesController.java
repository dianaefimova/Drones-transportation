package fi.sade23.web.dronsStation.fleet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fi.sade23.web.dronsStation.fleet.drone.Drone;

import java.util.List;

@RestController
@RequestMapping("/dronora/drones")
public class DronesController {

    private final DronesInventoryService dronesInventoryService;

    @Autowired
    public DronesController(DronesInventoryService dronesInventoryService) {
        this.dronesInventoryService = dronesInventoryService;
    }

    @GetMapping
    public ResponseEntity<List<Drone>> getAllDrones() {
        return ResponseEntity.ok(dronesInventoryService.getAllDrones());
    }

    @PostMapping
    public ResponseEntity<Drone> addDrone(@RequestBody Drone drone) {
        return ResponseEntity.ok(dronesInventoryService.addDrone(drone));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Drone> updateDrone(@PathVariable long id, @RequestBody Drone drone) {
        return ResponseEntity.ok(dronesInventoryService.updateDrone(id, drone));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDrone(@PathVariable long id) {
        dronesInventoryService.deleteDrone(id);
        return ResponseEntity.ok().build();
    }
}

