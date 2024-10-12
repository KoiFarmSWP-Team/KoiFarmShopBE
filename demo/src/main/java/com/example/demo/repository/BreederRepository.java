package com.example.demo.repository;

import com.example.demo.Entity.Breeder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreederRepository extends JpaRepository<Breeder, Long>
{
    Breeder findBreederById(long id);
    Breeder findBreederByBreedName(String breedName);
}
