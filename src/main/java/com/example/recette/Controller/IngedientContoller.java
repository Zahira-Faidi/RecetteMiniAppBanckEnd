package com.example.recette.Controller;

import com.example.recette.Service.IngredientService;
import com.example.recette.entite.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recettes")
public class IngedientContoller {
    @Autowired
    private IngredientService ingredientService;

    @GetMapping
    public List<Ingredient> getAllRecetes() {
        return ingredientService.getAllIngredients();
    }

    @GetMapping("/{id}")
    public Ingredient getIngedientById(@PathVariable int id) {
        return ingredientService.getIngredientById(id);
    }

    @PostMapping
    public Ingredient saveTask(@RequestBody Ingredient ingredient) {
        return ingredientService.saveIngredient(ingredient);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Ingredient> updateIngredient(@PathVariable int id, @RequestBody Ingredient newIngredient) {
        Ingredient updatedIngredient= ingredientService.updateIngredient(id, newIngredient);
        return updatedIngredient != null ? ResponseEntity.ok(updatedIngredient) : ResponseEntity.notFound().build();
    }
    @DeleteMapping("/{id}")
    public void deleteIngredient(@PathVariable int id) {
        ingredientService.deleteIngredient(id);
    }

}
