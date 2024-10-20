package com.kennn.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kennn.bookshop.domain.Cart;
import com.kennn.bookshop.domain.CartDetail;
import com.kennn.bookshop.domain.Product;

public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {
    CartDetail findByCartAndProduct(Cart cart, Product product);
}
