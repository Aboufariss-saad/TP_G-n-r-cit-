package Metier;

import java.util.List;

public interface IMetier <T> {
    void add(T o);
    List<T> getAll();
    public T findById(long id);
    public void delete(long id);
}