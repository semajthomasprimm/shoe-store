package com.semajthomasprimm.shoestore.database;

import com.semajthomasprimm.shoestore.domain.Product;

import java.util.List;

public interface ProductDataService{

    List<Product> getProducts();
    void copyEntityToProduct(ProductEntity productEntity, Product product);
    void copyProductToEntity(Product product, ProductEntity productEntity);
    Product getProduct(int id);
}
