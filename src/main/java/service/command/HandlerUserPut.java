package service.command;

public class HandlerUserPut extends CommandHandler {
    public HandlerUserPut(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {

    }

    @Override
    protected boolean isApplicable(String[] command) {
        return false;
    }
}
