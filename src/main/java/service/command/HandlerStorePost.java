package service.command;

import models.Order;
import service.OrderService;

public class HandlerStorePost extends CommandHandler{
    public HandlerStorePost(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        Order newOrder = OrderService.orderBuilder();
        new OrderService().createEntity(Order.class, newOrder);
        System.out.println("Created new order:" + newOrder);
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("post".equals(command[0]) && "order".equals(command[1]) && command.length == 2);
    }
}
