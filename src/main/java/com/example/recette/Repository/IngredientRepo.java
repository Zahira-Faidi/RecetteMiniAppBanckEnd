package com.example.recette.Repository;

import com.example.recette.entite.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepo extends JpaRepository<Ingredient , Integer > {
}
