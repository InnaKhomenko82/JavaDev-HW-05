package service.command;

import models.User;
import service.UserService;

public class HandlerUserGet extends CommandHandler {
    public HandlerUserGet(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        System.out.println("Get user: " + command[2]);
        System.out.println(new UserService().readByName(command[2]));
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("get".equals(command[0]) && "user".equals(command[1]) && command.length == 3);
    }
}
