package service.command;

public class HandlerStoreGetByOrder extends CommandHandler {
    public HandlerStoreGetByOrder(CommandHandler handler) {
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
