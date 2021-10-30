package service.command;

public class HandlerPetPostImage extends CommandHandler {
    public HandlerPetPostImage(CommandHandler handler) {
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
