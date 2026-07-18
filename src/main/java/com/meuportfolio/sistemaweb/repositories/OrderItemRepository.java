package com.meuportfolio.sistemaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuportfolio.sistemaweb.entities.OrderItem;
import com.meuportfolio.sistemaweb.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
