package edu.chl.hajo.shop.core;

import edu.chl.hajo.shop.utils.AbstractEntityContainer;
import java.util.ArrayList;
import java.util.List;

/**
 * All customers
 *
 * @author hajo
 */
public final class CustomerRegistry extends AbstractEntityContainer<Customer, Long>
        implements ICustomerRegistry {

    // Factory method
    public static ICustomerRegistry newInstance() {
        return new CustomerRegistry();
    }

    private CustomerRegistry() {
    }

    @Override
    public List<Customer> getByName(String name) {
        List<Customer> found = new ArrayList<>();
        for (Customer c : getRange(0, getCount())) {
            if (c.getFname().equals(name) || c.getLname().equals(name)) {
                found.add(c);
            }
        }
        return found;
    }
}
