package com.example.demo.product.entity;

import com.example.demo.product.entity.Product;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString(exclude = { "product" })
@Entity
@Getter
@NoArgsConstructor
public class ProductImages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String imageResourcePath;

    @Setter
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    public ProductImages(String imageResourcePath, Product product) {
        this.imageResourcePath = imageResourcePath;
        this.product = product;
    }
}