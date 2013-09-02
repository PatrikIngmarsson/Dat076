package edu.chl.hajo.shop.core;

import edu.chl.hajo.shop.utils.AbstractEntity;

/**
 * A single row in an Order
 *
 * @author hajo
 */
public class OrderItem extends AbstractEntity {

    private final Product product;
    private final int quantity;

    OrderItem(Product product, int quantity) {
        this.quantity = quantity;
        this.product = product;
    }
    
    OrderItem(Long id, Product product, int quantity) {
        super(id);
        this.quantity = quantity;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "product=" + product + ", quantity=" + quantity + '}';
    }
}
