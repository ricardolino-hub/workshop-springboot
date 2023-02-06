package com.estudandojava.workshopspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.workshopspringboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
