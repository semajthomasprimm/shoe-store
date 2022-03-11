package com.semajthomasprimm.shoestore.database;

import java.sql.Array;
import javax.persistence.*;

@Entity
@Table(name="products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="sizes")
    private String sizes;

    @Column(name="quantity")
    private int quantity;

    @Column(name="price")
    private double price;

    @Column(name="description")
    private String description;

}
