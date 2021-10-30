package service.command;

import models.User;
import service.UserService;

import java.util.List;

public class HandlerUserPostList extends CommandHandler {
    public HandlerUserPostList(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("post".equals(command[0]) && "user".equals(command[1])
                && "createWithList".equals(command[2]) && command.length == 3);
    }
}
