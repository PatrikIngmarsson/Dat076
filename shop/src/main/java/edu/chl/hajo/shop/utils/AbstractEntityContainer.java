package edu.chl.hajo.shop.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * A container for entities, base class for OrderBook, ProductCatalogue,
 * CustomerRegistry The fundamental common operations are here (CRUD).
 *
 * T is type for items in container K is type of id (primary key)
 *
 * @author hajo
 */
public abstract class AbstractEntityContainer<T extends IEntity<K>, K>
        implements IEntityContainer<T, K> {

    private List<T> elems = new ArrayList<>();

    @Override
    public void add(T t) {
        if (t == null) {
            throw new IllegalArgumentException("Nulls not allowed");
        }
        elems.add(t);
    }

    @Override
    public void remove(K id) {
        T t = find(id);
        if (t != null) {
            elems.remove(t);
        }
    }

    @Override
    public void update(T t) {
        T old = find(t.getId());
        if (old != null) {
            elems.remove(old);
        }
        elems.add(t);
    }

    @Override
    public T find(K id) {
        for (T t : elems) {
            if (t.getId().equals(id)) { // NOTE: equals, not ==
                return t;
            }
        }
        return null;
    }

    @Override
    public List<T> getRange(int first, int nItems) {
        // From inclusive, to exclusive
        return elems.subList(first, first + nItems);
    }

    @Override
    public int getCount() {
        return elems.size();
    }

    @Override
    public void sort(Comparator<T> comp) {
        Collections.sort(elems, comp);
    }
}
