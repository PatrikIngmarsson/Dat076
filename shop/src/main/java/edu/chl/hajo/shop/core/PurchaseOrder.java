package edu.chl.hajo.shop.core;

import edu.chl.hajo.shop.utils.AbstractEntity;
import java.util.Date;
import java.util.List;

/**
 * A purchase order
 *
 * @author hajo
 */
public class PurchaseOrder extends AbstractEntity {
    // State of order
    public enum State {

        ACCEPTED,
        CANCELLED,
        INVOICED,
        UNINVOIDED,
        SHIPPED,
    }
    private final Date date = new Date();
    private final List<OrderItem> items;
    private final Customer customer;
    private State state = State.ACCEPTED;

    public PurchaseOrder(Customer customer, List<OrderItem> items) {
        this.customer = customer;
        this.items = items;
    }

    public PurchaseOrder(Long id, Customer customer, List<OrderItem> items) {
        super(id);
        this.customer = customer;
        this.items = items;
    }

    public Date getDate() {
        return date;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" + "id=" + getId() + ", date=" + date
                + ", items=" + items + ", customer=" + customer
                + ", state=" + state + '}';
    }
}
