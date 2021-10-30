package service.command;

public class HandlerPetGet extends CommandHandler {
    public HandlerPetGet(CommandHandler handler) {
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
