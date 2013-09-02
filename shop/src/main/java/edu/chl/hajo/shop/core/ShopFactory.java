package edu.chl.hajo.shop.core;

/**
 * Static factory for Shops
 *
 * @author hajo
 */
public class ShopFactory {

    private ShopFactory() {
    }

    // If initTestData there will be some data to use
    public static IShop getShop(boolean initTestData) {
        Shop s = new Shop();
        if (initTestData) {
            initTestData(s);
        }
        return s;
    }

    // If we have no database we can use this
    private static void initTestData(Shop shop) {

        // Add new data
        shop.getProductCatalogue().add(new Product("banana", 11.11));
        shop.getProductCatalogue().add(new Product("apple", 22.22));
        shop.getProductCatalogue().add(new Product("pear", 33.33));
        shop.getProductCatalogue().add(new Product("pineapple", 44.44));
        shop.getProductCatalogue().add(new Product("orange", 55.55));
        shop.getProductCatalogue().add(new Product("pear", 66.66));
        
        shop.getCustomerRegistry().add(new Customer(new Address("aaa", 1, "aaa"),
                "arne", "arnesson", "arne@gmail.com"));
        shop.getCustomerRegistry().add(new Customer(new Address("bbbb", 2, "bbb"),
                "berit", "beritsson", "berit@gmail.com"));
        shop.getCustomerRegistry().add(new Customer(new Address("ccc", 3, "ccc"),
                "cecilia", "cecilia", "cecila@gmail.com"));

        Customer c = shop.getCustomerRegistry().getByName("arne").get(0);
        c.addProductToCart(shop.getProductCatalogue().getByName("banana").get(0));
        c.addProductToCart(shop.getProductCatalogue().getByName("apple").get(0));
        c.addProductToCart(shop.getProductCatalogue().getByName("pear").get(0));

        shop.getOrderBook().add(new PurchaseOrder(c, c.getCart().getAsOrderItems()));

    }
}
