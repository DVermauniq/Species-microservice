package com.species.AliveService.Controller;

import com.species.AliveService.Entity.Species;
import com.species.AliveService.Service.SpeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/species")
public class SpeciesController {

    @Autowired
    private SpeciesService speciesService;
    @PostMapping
    public Species addSpecies(@RequestBody Species species){
        return speciesService.addSpecies(species);
    }
    @GetMapping("/{id}")
    public Species getSpecies(@PathVariable int id){
        return speciesService.getSpecies(id);
    }
    @GetMapping
    public List<Species> getAllSpecies(){
        return speciesService.getAllSpecies();
    }

}
