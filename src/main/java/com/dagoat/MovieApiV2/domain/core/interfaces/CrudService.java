package com.dagoat.MovieApiV2.domain.core.interfaces;

public interface CrudService <T,I>{
    T create(T item);
    T findById(I id);
    Iterable<T> findAll();
    T update(T item);
    void delete(I id);
}
