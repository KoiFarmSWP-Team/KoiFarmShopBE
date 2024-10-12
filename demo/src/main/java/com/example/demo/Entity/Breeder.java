package com.example.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Entity
@Getter
@Setter
public class Breeder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "name can not be blank")
    private String breederName;

    boolean isDeleted = false;

    @ManyToMany (mappedBy = "breedersName")
    Set<KoiPack> koiPacksOf;
}
