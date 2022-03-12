package com.semajthomasprimm.shoestore.database;

import com.semajthomasprimm.shoestore.domain.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
        product.setSizes(Arrays.asList(productEntity.getSizes().split(",")));
        product.setQuantity(productEntity.getQuantity());
        product.setDescription(productEntity.getDescription());
        product.setPrice(productEntity.getPrice());
    }

    @Override
    public void copyProductToEntity(Product product, ProductEntity productEntity) {
        productEntity.setName(product.getName());
        productEntity.setSizes(listToStr(product.getSizes()));
        productEntity.setQuantity(product.getQuantity());
        productEntity.setDescription(product.getDescription());
        productEntity.setPrice(product.getPrice());
    }

    @Override
    public Product getProduct(int id) {
        Optional<ProductEntity> result = productRepository.findById(id);
        if(result.isPresent()){
            Product product = new Product();
            ProductEntity productEntity = result.get();
            copyEntityToProduct(productEntity, product);
            return product;
        }
        return null;
    }

    // Converts list of str into a string formatted with ,
    public String listToStr(List<String> sizes){
        String result = "";
        int i = 0;
        int len = sizes.size()-1;
        while(i < len){
            result += sizes.get(i) + ",";
            i++;
        }
        result += sizes.get(i);

        return result;
    }

}
