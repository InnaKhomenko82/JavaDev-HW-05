package service.command;

import models.ApiResponse;
import models.User;
import service.UserService;

public class HandlerUserDelete extends CommandHandler {
    public HandlerUserDelete(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        System.out.println("Deleting user: " + command[2]);
        new UserService().deleteByName(User.class, command[2]);
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("delete".equals(command[0]) && "user".equals(command[1]) && command.length == 3);
    }
}
