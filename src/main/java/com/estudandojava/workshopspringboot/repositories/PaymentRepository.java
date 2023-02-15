package com.estudandojava.workshopspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.workshopspringboot.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
