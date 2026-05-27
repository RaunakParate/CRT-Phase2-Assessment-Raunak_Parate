package com.example.service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository repo;

    @InjectMocks
    private ProductService service;

    @Test
    void testGetById() {

        Product p = new Product();

        p.setId(1L);
        p.setName("Laptop");

        when(repo.findById(1L))
                .thenReturn(Optional.of(p));

        Product result = service.getById(1L);

        assertEquals(
                "Laptop",
                result.getName()
        );
    }
}