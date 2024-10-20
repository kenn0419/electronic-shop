package com.kennn.bookshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kennn.bookshop.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByStatusTrue();
}
