package com.estudo.lojatestespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.lojatestespringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
