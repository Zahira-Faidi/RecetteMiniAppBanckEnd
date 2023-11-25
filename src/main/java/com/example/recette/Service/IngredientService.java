package com.example.recette.Service;

import com.example.recette.Repository.IngredientRepo;
import com.example.recette.entite.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {
    @Autowired
    private IngredientRepo ingredientRepo;

    public List<Ingredient> getAllIngredients() {
        return ingredientRepo.findAll();
    }

    public Ingredient getIngredientById(int id) {
        return ingredientRepo.findById(id).orElse(null);
    }

    public Ingredient saveIngredient(Ingredient ingredient) {
        return ingredientRepo.save(ingredient);
    }
    public Ingredient updateIngredient(int id, Ingredient newIngredient) {
        return ingredientRepo.findById(id).map(ingredient -> {
            ingredient.setNomIngredient(newIngredient.getNomIngredient());
            return ingredientRepo.save(ingredient);
        }).orElse(null);
    }
    public void deleteIngredient(int id) {
        ingredientRepo.deleteById(id);
    }
}
