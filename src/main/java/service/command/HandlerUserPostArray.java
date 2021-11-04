package service.command;

import controller.ConsoleController;
import models.User;
import service.UserService;
import util.Digitalization;


public class HandlerUserPostArray extends CommandHandler {
    public HandlerUserPostArray(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        String message = new UserService().createWithArray(UserService.userArrayBuilder());
        System.out.println("Created with your array: " + message);
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("post".equals(command[0]) && "user".equals(command[1])
                && "createWithArray".equals(command[2]) && command.length == 3);
    }
}
