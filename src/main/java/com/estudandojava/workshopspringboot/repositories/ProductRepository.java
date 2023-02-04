package com.estudandojava.workshopspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.workshopspringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
