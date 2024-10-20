package com.kennn.bookshop.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kennn.bookshop.domain.Cart;
import com.kennn.bookshop.domain.User;
import com.kennn.bookshop.repository.CartRepository;

@Service
public class CartService {
    private CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Optional<Cart> findById(long id) {
        return this.cartRepository.findById(id);
    }

    public Cart findByUser(User user) {
        return this.cartRepository.findByUser(user);
    }
}
