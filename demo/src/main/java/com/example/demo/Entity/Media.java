package com.example.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Media {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "type can not be blank")
    private String type;

    @Lob
    @NotNull(message = "dat can not be null")
    private byte[] data;

    boolean isDeleted = false;

    @ManyToOne
    @JoinColumn(name = "koi_pack_id")
    private KoiPack koiPack;

}
