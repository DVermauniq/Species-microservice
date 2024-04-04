package com.species.AliveService.Service;

import com.species.AliveService.Entity.Animal;


import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class PhylumServiceClient {

    private final RestClient restClient;
    public PhylumServiceClient(){
    restClient=RestClient.builder().baseUrl("http://localhost:8082").build();
    }

    public List<Animal> getAnimalsOfSpecies(int speciesId){
        return restClient.get()
                .uri("/animal/species/{id}", speciesId)
                .retrieve()
                .body(new ParameterizedTypeReference<List<Animal>>() {});

    }

}
