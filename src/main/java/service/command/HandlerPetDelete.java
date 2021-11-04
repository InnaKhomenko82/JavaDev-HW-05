package service.command;

import models.Pet;
import models.User;
import service.PetService;
import service.UserService;
import util.Digitalization;

public class HandlerPetDelete extends CommandHandler {
    public HandlerPetDelete(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        System.out.println("Deleting pet: " + command[2]);
        new PetService().deleteById(Pet.class, Digitalization.getLong(command[2]));
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("delete".equals(command[0]) && "pet".equals(command[1]) && command.length == 3);
    }
}
