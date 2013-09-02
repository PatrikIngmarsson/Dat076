package edu.chl.hajo.shop.core;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * Shop is a container for other containers
 * NOTE: Uses Java 1.7
 *
 * @author hajo
 */
public class Shop implements IShop {

    private final IProductCatalogue productCatalogue = ProductCatalogue.newInstance();
    private final ICustomerRegistry customerRegistry = CustomerRegistry.newInstance();
    private final IOrderBook orderBook = OrderBook.newInstance();

    public Shop() {
        Logger.getAnonymousLogger().log(Level.INFO, "Shop alive {0}", this.hashCode());
    }

    @Override
    public ICustomerRegistry getCustomerRegistry() {
        return customerRegistry;
    }

    @Override
    public IOrderBook getOrderBook() {
        return orderBook;
    }

    @Override
    public IProductCatalogue getProductCatalogue() {
        return productCatalogue;
    }
}
