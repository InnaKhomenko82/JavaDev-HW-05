package service.command;

import models.User;
import service.UserService;

public class HandlerUserPost extends CommandHandler {
    public HandlerUserPost(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        User newUser = UserService.userBuilder();
        new UserService().createEntity(User.class, newUser);
        System.out.println("Created new user:" + newUser);
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("post".equals(command[0]) && "user".equals(command[1]) && command.length == 2);
    }
}
