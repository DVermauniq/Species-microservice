package com.species.Phylum.Service;

import com.species.Phylum.Entity.Animal;
import com.species.Phylum.Repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepo;

    public Animal addAnimal(Animal animal) {
        return animalRepo.save(animal);
    }

    public Animal getAnimal(int id) {
        return animalRepo.findById(id).orElseThrow(()->new RuntimeException("Animal not Found"));
    }

    public List<Animal> getAllAnimal() {
        return animalRepo.findAll();
    }
    public List<Animal> getAnimalOfSpecies(int speciesId){
        return animalRepo.findBySpeciesId(speciesId);

    }
}
