package com.example.pharmacymanager.DAO;

import com.example.pharmacymanager.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RecipeDAO extends JpaRepository<Recipe, Long> {


}
