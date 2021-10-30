package service.command;

public class HandlerPetPut extends CommandHandler {
    public HandlerPetPut(CommandHandler handler) {
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
