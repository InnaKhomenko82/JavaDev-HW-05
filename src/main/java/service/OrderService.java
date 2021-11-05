package service;

import controller.BaseConnection;
import controller.ConsoleController;
import models.Order;
import models.OrderStatus;
import util.Digitalization;
import util.RetrofitConfig;

import java.util.Optional;

public class OrderService implements BaseService<Order, Long>{
    RetrofitOrder retrofitOrder = BaseConnection.retrofitClient(RetrofitOrder.class);

    @Override
    public Order createEntity(Class<Order> eClass, Order order) {
        return RetrofitConfig.execute(retrofitOrder.addEntity(order));
    }

    @Override
    public Order readById(Class<Order> eClass, Long aLong) {
        return RetrofitConfig.execute(retrofitOrder.getEntity(aLong));
    }

    @Override
    public Order readByName(Class<Order> eClass, String userName) {
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
        RetrofitConfig.execute(retrofitOrder.deleteEntity(ID));
    }

    public static Order orderBuilder(){
        System.out.println("Insert order details:\n" +
                "id|petID|quantity|shipDate|status|complete");
        String[] parameters = ConsoleController.read();
        return Order.builder()
                .id(Digitalization.getLong(parameters[0]))
                .petId(Digitalization.getLong(parameters[1]))
                .quantity(Digitalization.getInteger(parameters[2]))
                .shipDate(Digitalization.getDate(parameters[3]))
                .status(OrderStatus.valueOf(parameters[4]))
                .complete(Boolean.valueOf(parameters[5]))
                .build();
    }
}
