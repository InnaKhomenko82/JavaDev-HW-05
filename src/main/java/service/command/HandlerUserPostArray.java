package service.command;

public class HandlerUserPostArray extends CommandHandler {
    public HandlerUserPostArray(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {

    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("post".equals(command[0]) && "user".equals(command[1])
                && "createWithArray".equals(command[2]) && command.length == 3);
    }
}
