package com.species.Phylum.Repository;

import com.species.Phylum.Entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Integer> {
    List<Animal> findBySpeciesId(int speciesID);
}
