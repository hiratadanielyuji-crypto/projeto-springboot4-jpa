package com.meuportfolio.sistemaweb.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.meuportfolio.sistemaweb.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
