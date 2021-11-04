package service.command;

import models.Pet;
import service.PetService;

public class HandlerPetPost extends CommandHandler {
    public HandlerPetPost(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        Pet newPet = PetService.petBuilder();
        new PetService().createEntity(Pet.class, newPet);
        System.out.println("Created new order:" + newPet);
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("post".equals(command[0]) && "pet".equals(command[1]) && command.length == 2);
    }
}
