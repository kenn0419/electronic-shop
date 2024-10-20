package com.kennn.bookshop.controller.api;

import org.springframework.web.bind.annotation.RestController;

import com.kennn.bookshop.domain.Cart;
import com.kennn.bookshop.domain.Order;
import com.kennn.bookshop.domain.User;
import com.kennn.bookshop.service.OrderService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.util.Optional;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class OrderApiController {

    private OrderService orderService;

    public OrderApiController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/api/cancel-order/{id}")
    public Map<String, Object> cancelOrder(@PathVariable long id) {
        Optional<Order> optionalOrder = this.orderService.findById(id);

        if (optionalOrder.isPresent()) {
            Order order = optionalOrder.get();

            Map<String, Object> response = this.orderService.cancelOrder(order);
            return response;
        }
        return null;
    }

}
