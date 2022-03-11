package com.semajthomasprimm.shoestore.database;

import com.semajthomasprimm.shoestore.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDataServiceImpl implements ProductDataService{

    private final ProductRepository productRepository;

    public ProductDataServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public void copyEntityToProduct(ProductEntity productEntity, Product product) {

    }

    @Override
    public void copyProductToEntity(Product product, ProductEntity productEntity) {

    }

    @Override
    public void insertProduct(Product product) {

    }

    @Override
    public Product getProduct(int id) {
        return null;
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deletePet(int id) {

    }
}
