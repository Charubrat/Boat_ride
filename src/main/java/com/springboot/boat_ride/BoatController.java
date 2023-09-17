package com.springboot.boat_ride;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoatController{
    private final BoatService boatService;

    public BoatController(BoatService boatService){
        this.boatService = boatService;
    }

    @GetMapping("/boats")
    public List<Boat> getBoatsName(){
        return boatService.getBoatsName();
    }
}