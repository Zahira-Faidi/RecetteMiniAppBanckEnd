package com.example.recette.Service;

import com.example.recette.Repository.RecetteRepo;
import com.example.recette.entite.Recette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetteService {

    @Autowired
    private RecetteRepo recetteRepo;

    public List<Recette> getAllRecettes() {
        return recetteRepo.findAll();
    }

    public Recette getRecetteById(int id) {
        return recetteRepo.findById(id).orElse(null);
    }

    public Recette saveRecette(Recette recette) {
        return recetteRepo.save(recette);
    }
    public Recette updateRecette(int id, Recette newRecette) {
        return recetteRepo.findById(id).map(recette -> {
            recette.setNom(newRecette.getNom());
            recette.setEtape(newRecette.getEtape());
            recette.setDureePreparation(newRecette.getDureePreparation());
            recette.setPhoto(newRecette.getPhoto());
            recette.setIngredient(newRecette.getIngredient());
            return recetteRepo.save(recette);
        }).orElse(null);
    }
    public void deleteRecette(int id) {
        recetteRepo.deleteById(id);
    }
}

