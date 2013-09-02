/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.hajo.shop.core;

import edu.chl.hajo.shop.utils.IEntity;
import java.util.Comparator;

/**
 * Sorting on long id's (later done by database)
 * @author hajo
 */
public class LongIdComparator<T extends IEntity<Long>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        Long id1 = o1.getId();
        Long id2 = o2.getId();
        if (id1 < id2) {
            return -1;
        } else if (o1.getId() > o2.getId()) {
            return 1;
        } else {
            return 0;
        }
    }
}
