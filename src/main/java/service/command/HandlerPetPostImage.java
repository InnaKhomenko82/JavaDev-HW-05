package service.command;

import service.PetService;

public class HandlerPetPostImage extends CommandHandler {
    public HandlerPetPostImage(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {

    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("post".equals(command[0]) && "pet".equals(command[1]) && "image".equals(command[2]) && command.length == 4);
    }
}
