package com.species.Phylum.Controller;

import com.species.Phylum.Entity.Animal;
import com.species.Phylum.Service.AnimalService;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    @Autowired
    private AnimalService animalService;
    @PostMapping
    public Animal addAnimal(@RequestBody Animal animal){
        return animalService.addAnimal(animal);
    }
    @GetMapping("/{id}")
    public Animal getAnimal(@PathVariable int id){
        return animalService.getAnimal(id);
    }
    @GetMapping
    public List<Animal> getAllAnimal(){
        return animalService.getAllAnimal();
    }
    @GetMapping("/species/{speciesId}")
    public List<Animal> getAnimalOfSpecies(@PathVariable int speciesId){
        return animalService.getAnimalOfSpecies(speciesId);

    }
}
