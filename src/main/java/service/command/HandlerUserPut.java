package service.command;

import models.User;
import service.UserService;

public class HandlerUserPut extends CommandHandler {
    public HandlerUserPut(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        User updateUser = UserService.userBuilder();
        new UserService().updateEntity(User.class, updateUser);
        System.out.println("Updated new user:" + updateUser);
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("put".equals(command[0]) && "user".equals(command[1]) && command.length == 2);
    }
}
