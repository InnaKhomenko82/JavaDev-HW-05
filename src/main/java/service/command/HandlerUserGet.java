package service.command;

import models.User;
import service.UserService;

import java.util.Optional;

public class HandlerUserGet extends CommandHandler {
    public HandlerUserGet(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        System.out.println("Get user: " + command[2]);
        Optional<User> user = new UserService().readByName(User.class, command[2]);
        System.out.println(user.isPresent()? user.get(): "No such entity((");
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("get".equals(command[0]) && "user".equals(command[1]) && command.length == 3);
    }
}