package service.command;

import models.Pet;
import models.User;
import service.PetService;
import service.UserService;

public class HandlerPetPut extends CommandHandler {
    public HandlerPetPut(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        Pet updatePet = PetService.petBuilder();
        new PetService().updateEntity(Pet.class, updatePet);
        System.out.println("Updated new pet:" + updatePet);
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("put".equals(command[0]) && "pet".equals(command[1]) && command.length == 2);
    }
}
