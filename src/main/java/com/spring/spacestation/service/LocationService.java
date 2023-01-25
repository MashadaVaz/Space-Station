package com.spring.spacestation.service;

import com.spring.spacestation.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LocationService {


    @Autowired
    private RestTemplate restTemplate;

    public Location getLocation() {
//        RestTemplate restTemplate = new RestTemplate();
        Location location=new Location();

        try {
            location = restTemplate.getForObject("https://api.wheretheiss.at/v1/satellites/25544.", Location.class);
            return location;
        } catch (Exception e) {
            try {
                location = restTemplate.getForObject("https://api.wheretheiss.at/v1/satellites/25544.", Location.class);
                return location;
            }  catch (Exception exc) {
                    location.setLatitude(0);
                    location.setLongitude(0);
                    return location;
            }


        }

    }

}
