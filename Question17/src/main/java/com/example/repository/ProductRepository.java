package com.example.repository;

import com.example.entity.Product;

import java.util.Optional;

public interface ProductRepository {

    Optional<Product> findById(Long id);
}