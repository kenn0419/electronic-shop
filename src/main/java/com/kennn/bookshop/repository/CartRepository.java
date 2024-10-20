package com.kennn.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kennn.bookshop.domain.Cart;
import com.kennn.bookshop.domain.User;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByUser(User user);
}
