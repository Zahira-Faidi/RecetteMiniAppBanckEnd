package com.example.recette.Repository;

import com.example.recette.entite.Recette;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetteRepo extends JpaRepository< Recette, Integer> {
}
