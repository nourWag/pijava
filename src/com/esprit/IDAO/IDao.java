package com.esprit.IDAO;

import java.util.List;

/**
 *
 * @author megaplus
 */
public interface IDao<T> {
    void insert (T t);
    void update(T t);
    void update1(T t);
     void delete(T t);
     List<T>displayAll();
     T findById(int id);
    void removeById(int id);
}
