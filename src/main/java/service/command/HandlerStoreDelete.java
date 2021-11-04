package service.command;

import models.Order;
import service.OrderService;
import util.Digitalization;

public class HandlerStoreDelete extends CommandHandler {
    public HandlerStoreDelete(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        System.out.println("Deleting order: " + command[2]);
        new OrderService().deleteById(Order.class, Digitalization.getLong(command[2]));
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("delete".equals(command[0]) && "order".equals(command[1]) && command.length == 3);
    }
}
