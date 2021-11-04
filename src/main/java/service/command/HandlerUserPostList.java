package service.command;

import service.UserService;


public class HandlerUserPostList extends CommandHandler {
    public HandlerUserPostList(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        String message = new UserService().createUserWithList(UserService.userListBuilder());
        System.out.println("Created with your list: " + message);
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("post".equals(command[0]) && "user".equals(command[1])
                && "createWithList".equals(command[2]) && command.length == 3);
    }
}
