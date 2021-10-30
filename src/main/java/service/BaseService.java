package service;

import models.BaseEntity;

public interface BaseService<T extends BaseEntity<ID>, ID> {
    T createEntity(Class<T> eClass, T t);
    T updateEntity(Class<T> eClass, T t);
    void deleteByName(Class<T> eClass, String userName);
    void deleteById(Class<T> eClass, Long ID);
}
