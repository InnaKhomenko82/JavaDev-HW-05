package service.command;

import models.User;
import service.UserService;

public class HandlerUserGetLogin extends CommandHandler {
    public HandlerUserGetLogin(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        System.out.println("Get user login: " + command[3]);
        System.out.println(new UserService().userLogin(command[3], command[4]).getMessage());
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("get".equals(command[0]) && "user".equals(command[1])
                && "login".equals(command[2]) && command.length == 5);
    }
}
