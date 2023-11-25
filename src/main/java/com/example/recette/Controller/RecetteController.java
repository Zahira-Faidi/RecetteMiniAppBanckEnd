package com.example.recette.Controller;

import com.example.recette.Service.RecetteService;
import com.example.recette.entite.Recette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recettes")
public class RecetteController {
        @Autowired
        private RecetteService recetteService;

        @GetMapping
        public List<Recette> getAllRecetes() {
            return recetteService.getAllRecettes();
        }

        @GetMapping("/{id}")
        public Recette getRecetteById(@PathVariable int id) {
            return recetteService.getRecetteById(id);
        }

        @PostMapping
        public Recette saveTask(@RequestBody Recette recette) {
            return recetteService.saveRecette(recette);
        }
        @PutMapping("/{id}")
        public ResponseEntity<Recette> updateRecette(@PathVariable int id, @RequestBody Recette newRecette) {
            Recette updatedRecette = recetteService.updateRecette(id, newRecette);
            return updatedRecette != null ? ResponseEntity.ok(updatedRecette) : ResponseEntity.notFound().build();
        }
        @DeleteMapping("/{id}")
        public void deleteRecette(@PathVariable int id) {
            recetteService.deleteRecette(id);
        }
}
