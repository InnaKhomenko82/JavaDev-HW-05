package service;

import models.BaseEntity;

import java.util.Optional;

public interface BaseService<T extends BaseEntity<ID>, ID> {
    T createEntity(Class<T> eClass, T t);
    Optional<T> readById(Class<T> eClass, ID id);
    Optional<T> readByName(Class<T> eClass, String userName);
    T updateEntity(Class<T> eClass, T t);
    void deleteByName(Class<T> eClass, String userName);
    void deleteById(Class<T> eClass, Long ID);
}
