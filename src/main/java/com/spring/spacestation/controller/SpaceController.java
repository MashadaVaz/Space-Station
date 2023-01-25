package com.spring.spacestation.controller;

import com.spring.spacestation.model.Location;
import com.spring.spacestation.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpaceController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/location")
    public ResponseEntity<Location> getLocation() {
        Location loc = locationService.getLocation();

        if(loc!=null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(loc);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }

    }



}
