package com.semajthomasprimm.shoestore.database;

import com.semajthomasprimm.shoestore.domain.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductDataServiceImpl implements ProductDataService{

    private final ProductRepository productRepository;

    public ProductDataServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProducts() {
        List<ProductEntity> productEntities = productRepository.findAll();
        List<Product> products = new ArrayList<>();

        for(ProductEntity productEntity : productEntities){
            Product product = new Product();
            copyEntityToProduct(productEntity, product);
            products.add(product);
        }
        return products;
    }

    @Override
    public void copyEntityToProduct(ProductEntity productEntity, Product product) {
        product.setId(productEntity.getId());
        product.setName(productEntity.getName());
        product.setSizes(productEntity.getSizes());
        product.setQuantity(productEntity.getQuantity());
        product.setDescription(productEntity.getDescription());
        product.setPrice(productEntity.getPrice());
    }

    @Override
    public void copyProductToEntity(Product product, ProductEntity productEntity) {
        productEntity.setName(product.getName());
        productEntity.setSizes(product.getSizes());
        productEntity.setQuantity(product.getQuantity());
        productEntity.setDescription(product.getDescription());
        productEntity.setPrice(product.getPrice());
    }

    @Override
    public Product getProduct(int id) {
        return null;
    }

}
