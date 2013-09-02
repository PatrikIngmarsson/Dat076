package edu.chl.hajo.shop.core;

/**
 * Public interface for the shop
 * @author hajo
 */
public interface IShop {

    public ICustomerRegistry getCustomerRegistry();

    public IOrderBook getOrderBook();

    public IProductCatalogue getProductCatalogue();
}
