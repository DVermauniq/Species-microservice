package com.species.AliveService.Controller;

import com.species.AliveService.Entity.Animal;

import com.species.AliveService.Service.PhylumServiceClient;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animal-client")
public class AnimalClientController {
    @Autowired
    private PhylumServiceClient phylumServiceClient;

    public List<Animal> getAllAnimalsOfSpecies(int speciesId){
        return phylumServiceClient.getAnimalsOfSpecies(speciesId);
    }
}
