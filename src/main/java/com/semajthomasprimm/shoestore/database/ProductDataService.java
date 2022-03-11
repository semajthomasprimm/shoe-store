package com.semajthomasprimm.shoestore.database;

import com.semajthomasprimm.shoestore.domain.Product;

import java.util.List;

public interface ProductDataService{

    List<Product> getProducts();
    void copyEntityToProduct(ProductEntity productEntity, Product product);
    void copyProductToEntity(Product product, ProductEntity productEntity);
    void insertProduct(Product product);
    Product getProduct(int id);
    void updateProduct(Product product);
    void deletePet(int id);
}
