package service.command;

import models.Pet;
import service.PetService;
import util.Digitalization;

import java.util.Optional;

public class HandlerPetGetByStatus extends CommandHandler {
    public HandlerPetGetByStatus(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        System.out.println("Get pet by status: " + command[3]);
        Optional<Pet> pet = Optional.ofNullable(new PetService().readByName(Pet.class, command[2]));
        System.out.println(pet.isPresent()? pet.get(): "No such entity((");
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("get".equals(command[0]) && "pet".equals(command[1]) && "findByStatus".equals(command[2]) && command.length == 4);
    }
}
