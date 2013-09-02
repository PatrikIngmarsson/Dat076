
package edu.chl.hajo.shop.core;

import edu.chl.hajo.shop.utils.IEntityContainer;
import java.util.List;

/**
 * Interface to order book
 * @author hajo
 */
public interface IOrderBook extends IEntityContainer<PurchaseOrder, Long> {

    List<PurchaseOrder> getByCustomer(Customer c);
    
}
