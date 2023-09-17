package com.springboot.boat_ride;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
@CrossOrigin
public class BoatRideApplication {
    public static void main(String[] args){
        SpringApplication.run(BoatRideApplication.class, args);
    }
}
