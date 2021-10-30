package service.command;

import service.UserService;

public class HandlerUserLogout extends CommandHandler {
    public HandlerUserLogout(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        System.out.println("Get user logout:");
        System.out.println(new UserService().userLogout().getMessage());
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("get".equals(command[0]) && "user".equals(command[1])
                && "logout".equals(command[2]) && command.length == 3);
    }
}
