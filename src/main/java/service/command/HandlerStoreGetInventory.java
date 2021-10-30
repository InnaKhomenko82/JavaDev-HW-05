package service.command;

public class HandlerStoreGetInventory extends CommandHandler {
    public HandlerStoreGetInventory(CommandHandler handler) {
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
