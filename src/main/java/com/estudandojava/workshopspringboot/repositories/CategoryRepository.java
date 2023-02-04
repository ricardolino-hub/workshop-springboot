package com.estudandojava.workshopspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.workshopspringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
