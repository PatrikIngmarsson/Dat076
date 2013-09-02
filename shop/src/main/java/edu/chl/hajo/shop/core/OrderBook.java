package edu.chl.hajo.shop.core;

import edu.chl.hajo.shop.utils.AbstractEntityContainer;
import java.util.ArrayList;
import java.util.List;

/**
 * All orders
 *
 * @author hajo
 */
public final class OrderBook extends AbstractEntityContainer<PurchaseOrder, Long>
        implements IOrderBook {

    // Factory method
    public static IOrderBook newInstance() {
        return new OrderBook();
    }

    private OrderBook() {
    }

    @Override
    public List<PurchaseOrder> getByCustomer(Customer c) {
        List<PurchaseOrder> found = new ArrayList<>();
        for (PurchaseOrder po : getRange(0, getCount())) {
            if (po.getCustomer().equals(c)) {
                found.add(po);
            }
        }
        return found;
    }
}
