package edu.chl.hajo.shop.core;

import edu.chl.hajo.shop.utils.AbstractEntity;

/**
 * A Product
 * @author hajo
 */
public class Product extends AbstractEntity {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(Long id, String name, double price) {
        super(id);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
     
    @Override
    public String toString() {
        return "Product{" + "id=" + getId() + ", name=" + name + ", price=" + price + '}';
    }
}
