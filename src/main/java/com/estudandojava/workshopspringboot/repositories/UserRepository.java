package com.estudandojava.workshopspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.workshopspringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
