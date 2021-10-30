package service.command;

public class HandlerPetGetByStatus extends CommandHandler {
    public HandlerPetGetByStatus(CommandHandler handler) {
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
