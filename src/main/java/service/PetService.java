package service;

import controller.BaseConnection;
import models.Pet;
import util.RetrofitConfig;

public class PetService implements BaseService<Pet, Long>{
    RetrofitPet retrofitPet = BaseConnection.retrofitClient(RetrofitPet.class);

    @Override
    public Pet createEntity(Class<Pet> eClass, Pet pet) {
        return RetrofitConfig.execute(retrofitPet.addEntity(pet));
    }

    @Override
    public Pet updateEntity(Class<Pet> eClass, Pet pet) {
        return null;
    }

    @Override
    public void deleteByName(Class<Pet> eClass, String userName) {

    }

    @Override
    public void deleteById(Class<Pet> eClass, Long ID) {

    }
}
