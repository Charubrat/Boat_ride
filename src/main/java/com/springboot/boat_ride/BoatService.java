package com.springboot.boat_ride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoatService {
    private final BoatRepository boatRepository;

    @Autowired
    public BoatService(BoatRepository boatRepository) {
        this.boatRepository = boatRepository;
    }
    public List<Boat> getBoatsName(){
        return boatRepository.findAll();
    }

    // You can add more methods here to handle other business logic related to boats.
}
