package service.command;

import models.Order;
import service.OrderService;
import util.Digitalization;

import java.util.Optional;

public class HandlerStoreGetByOrder extends CommandHandler {
    public HandlerStoreGetByOrder(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        System.out.println("Get order: " + command[2]);
        Optional<Order> order = Optional.ofNullable(new OrderService().readById(Order.class, Digitalization.getLong(command[2])));
        System.out.println(order.isPresent()? order.get(): "No such entity((");
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("get".equals(command[0]) && "order".equals(command[1]) && command.length == 3);
    }
}
