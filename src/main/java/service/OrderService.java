package service;

import controller.BaseConnection;
import models.Order;

public class OrderService implements BaseService<Order, Long>{
    RetrofitOrder retrofitOrder = BaseConnection.retrofitClient(RetrofitOrder.class);

    @Override
    public Order createEntity(Class<Order> eClass, Order order) {
        return null;
    }

    @Override
    public Order updateEntity(Class<Order> eClass, Order order) {
        return null;
    }

    @Override
    public void deleteByName(Class<Order> eClass, String userName) {

    }

    @Override
    public void deleteById(Class<Order> eClass, Long ID) {

    }
}
