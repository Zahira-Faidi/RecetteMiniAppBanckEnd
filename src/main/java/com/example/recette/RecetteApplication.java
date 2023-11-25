package com.example.recette;

import com.example.recette.Repository.IngredientRepo;
import com.example.recette.Repository.RecetteRepo;
import com.example.recette.entite.Ingredient;
import com.example.recette.entite.Recette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class RecetteApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RecetteApplication.class, args);
    }
    @Autowired
    RecetteRepo recetteRepo;
    @Autowired
    IngredientRepo ingredientRepo;
    @Override
    public void run(String... args) throws Exception {
        Ingredient ingredient = new Ingredient();
        ingredient.setNomIngredient("Test1");
        ingredientRepo.save(ingredient);

        Recette recette = new Recette();
        recette.setNom("Test01");
        recette.setEtape("Description");
        recette.setDureePreparation(new Date());
        recette.setPhoto("");
        recette.getIngredient().add(ingredient);
        recetteRepo.save(recette);


    }
}
