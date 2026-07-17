package com.meuportfolio.sistemaweb.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.meuportfolio.sistemaweb.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
