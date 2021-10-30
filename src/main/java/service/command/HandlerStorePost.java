package service.command;

public class HandlerStorePost extends CommandHandler{
    public HandlerStorePost(CommandHandler handler) {
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
