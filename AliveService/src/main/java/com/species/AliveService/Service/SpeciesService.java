package com.species.AliveService.Service;

import com.species.AliveService.Entity.Species;
import com.species.AliveService.Repository.SpeciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpeciesService {
    @Autowired
    private SpeciesRepository speciesRepo;
    @Autowired
    private PhylumServiceClient phylumServiceClient;
    public Species addSpecies(Species species){
        return speciesRepo.save(species);
    }

    public Species getSpecies(int id) {
        Species species= speciesRepo.findById(id).orElseThrow(()->new RuntimeException("Species not found")) ;

        species.setAnimals(phylumServiceClient.getAnimalsOfSpecies(species.getSpeciesId()));
        return species;
    }
    public List<Species> getAllSpecies(){

        List <Species> species = speciesRepo.findAll();
        List<Species> newSpeciesList=
        species.stream().map(specie->{specie.setAnimals(phylumServiceClient.getAnimalsOfSpecies(specie.getSpeciesId()));
        return specie;
        }).collect(Collectors.toList());
        return newSpeciesList;

    }
}
