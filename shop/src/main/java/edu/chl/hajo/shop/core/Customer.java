package edu.chl.hajo.shop.core;

import edu.chl.hajo.shop.utils.AbstractEntity;

/**
 * A Customer
 * @author hajo
 */
public class Customer extends AbstractEntity {

    private transient Cart cart = new Cart();
    private final Address address;
    private final String fname;
    private final String lname;
    private final String email;

    public Customer(Address address, String fname,
            String lname, String email) {
        this.address = address;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }
    
    public Customer(Long id, Address address, String fname,
            String lname, String email) {
        super(id);
        this.address = address;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    public void addProductToCart(Product product) {
        cart.add(product);
    }

    public void removeProductFromCart(Product product) {
        cart.remove(product);
    }

    public void emptyCart() {
        cart = new Cart();
    }

    public Address getAddress() {
        return address;
    }

    public Cart getCart() {
        return cart;
    }

    public String getEmail() {
        return email;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + getId() + ", address=" + address + ", fname=" + fname + ", lname=" + lname + ", email=" + email + '}';
    }
}
