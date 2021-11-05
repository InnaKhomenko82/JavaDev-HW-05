package service.command;

import models.Pet;
import service.PetService;
import util.Digitalization;

import java.util.Optional;

public class HandlerPetGet extends CommandHandler {
    public HandlerPetGet(CommandHandler handler) {
        super(handler);
    }

    @Override
    protected void apply(String[] command) {
        System.out.println("Get pet: " + command[2]);
        Optional<Pet> pet = Optional.ofNullable(new PetService().readById(Pet.class, Digitalization.getLong(command[2])));
        System.out.println(pet.isPresent()? pet.get(): "No such entity((");
    }

    @Override
    protected boolean isApplicable(String[] command) {
        return ("get".equals(command[0]) && "pet".equals(command[1]) && command.length == 3);
    }
}
