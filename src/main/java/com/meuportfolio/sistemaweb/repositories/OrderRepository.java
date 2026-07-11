package com.meuportfolio.sistemaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuportfolio.sistemaweb.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
