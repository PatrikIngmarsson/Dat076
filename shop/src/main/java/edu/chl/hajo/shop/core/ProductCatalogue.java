package edu.chl.hajo.shop.core;

import edu.chl.hajo.shop.utils.AbstractEntityContainer;
import java.util.ArrayList;
import java.util.List;

/**
 * All products
 *
 * @author hajo
 */
public final class ProductCatalogue extends AbstractEntityContainer<Product, Long>
        implements IProductCatalogue {

    private ProductCatalogue() {
    }

    // Factory method
    public static IProductCatalogue newInstance() {
        return new ProductCatalogue();
    }

    @Override
    public List<Product> getByName(String name) {
        List<Product> found = new ArrayList<>();
        for (Product p : getRange(0, getCount())) {
            if (p.getName().equals(name)) {
                found.add(p);
            }
        }
        return found;
    }
}
