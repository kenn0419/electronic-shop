package com.kennn.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kennn.bookshop.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
