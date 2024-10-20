package com.kennn.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kennn.bookshop.domain.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {

}
