package com.example.recette.entite;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Recette {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String etape;
    @Temporal(TemporalType.TIME)
    private Date dureePreparation;
    private String photo;
    @OneToMany
    private List<Ingredient> Ingredient = new ArrayList<>();
}