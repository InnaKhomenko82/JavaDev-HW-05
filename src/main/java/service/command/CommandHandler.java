package service.command;

public abstract class CommandHandler{

    private final CommandHandler handler;

    public CommandHandler(CommandHandler handler){
        this.handler = handler;
    }

    protected abstract void apply(String[] command);
    protected abstract boolean isApplicable(String[] command);

    public final void handle(String[] command){
        if (isApplicable(command)) apply(command);
        else handler.handle(command);
    }

    public static CommandHandler of(){
        return new HandlerPetPost(new HandlerPetPostImage(new HandlerPetPut(
               new HandlerPetGetByStatus(new HandlerPetGet(new HandlerPetDelete(
               new HandlerStoreGetInventory(new HandlerStorePost(
               new HandlerStoreGetByOrder(new HandlerStoreDelete(
               new HandlerUserGetLogin(new HandlerUserLogout(new HandlerUserGet(
               new HandlerUserPost(new HandlerUserPostList(new HandlerUserPostArray(
               new HandlerUserPut(new HandlerUserDelete(
               new HandlerHelp(new HandlerExit(new HandlerException()
        ))))))))))))))))))));
    }
}
