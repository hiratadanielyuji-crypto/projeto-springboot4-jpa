package com.meuportfolio.sistemaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuportfolio.sistemaweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
