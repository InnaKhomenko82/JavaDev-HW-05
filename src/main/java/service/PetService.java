package service;

import controller.BaseConnection;
import controller.ConsoleController;
import models.Category;
import models.Pet;
import models.PetStatus;
import util.Digitalization;
import util.RetrofitConfig;

import java.util.Optional;

public class PetService implements BaseService<Pet, Long>{
    RetrofitPet retrofitPet = BaseConnection.retrofitClient(RetrofitPet.class);

    @Override
    public Pet createEntity(Class<Pet> eClass, Pet pet) {
        return RetrofitConfig.execute(retrofitPet.addEntity(pet));
    }

    @Override
    public Pet readById(Class<Pet> eClass, Long aLong) {
        return RetrofitConfig.execute(retrofitPet.getEntity(aLong));
    }

    @Override
    public Pet readByName(Class<Pet> eClass, String userName) {
        return null;
    }

    @Override
    public Pet updateEntity(Class<Pet> eClass, Pet pet) {
        return RetrofitConfig.execute(retrofitPet.updateEntity(pet));
    }

    @Override
    public void deleteByName(Class<Pet> eClass, String userName) {

    }

    @Override
    public void deleteById(Class<Pet> eClass, Long ID) {
        RetrofitConfig.execute(retrofitPet.deleteEntity(ID));
    }

    public static Pet petBuilder(){
        System.out.println("Insert pet details:\n" +
                "id|name|status|category");
        String[] parameters = ConsoleController.read();
        return Pet.builder()
                .id(Digitalization.getLong(parameters[0]))
                .name(parameters[1])
                .status(PetStatus.valueOf(parameters[2]))
                .category(new Category(0L,parameters[3]))
                .build();
    }
}
