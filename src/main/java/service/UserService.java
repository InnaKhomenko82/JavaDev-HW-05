package service;

import controller.BaseConnection;
import controller.ConsoleController;
import models.ApiResponse;
import models.User;
import util.Digitalization;
import util.RetrofitConfig;

public class UserService implements BaseService<User, Long> {

    RetrofitUser retrofitUser = BaseConnection.retrofitClient(RetrofitUser.class);

    @Override
    public User createEntity(Class<User> eClass,User user) {
        return RetrofitConfig.execute(retrofitUser.addEntity(user));
    }

    public User readByName(String name) {
        return RetrofitConfig.execute(retrofitUser.getUserByUserName(name));
    }

    @Override
    public User updateEntity(Class<User> eClass, User user) {
        return RetrofitConfig.execute(retrofitUser.updateUserByUserName(user, user.getUserName()));
    }

    @Override
    public void deleteByName(Class<User> eClass, String userName) {
        RetrofitConfig.execute(retrofitUser.deleteUser(userName));
    }

    @Override
    public void deleteById(Class<User> eClass, Long ID) {

    }

    public ApiResponse userLogin (String userName, String password){
        return RetrofitConfig.execute(retrofitUser.userLogin(userName, password));
    }

    public ApiResponse userLogout(){
        return (ApiResponse) RetrofitConfig.execute(retrofitUser.userLogout());
    }

    public static User userBuilder(){
        System.out.println("Insert user details:\n" +
                "id|userName|firstName|lastName|email|password|phone|userStatus");
        String[] parameters = ConsoleController.read();
        return User.builder()
                .id(Digitalization.getLong(parameters[0]))
                .userName(parameters[1])
                .firstName(parameters[2])
                .lastName(parameters[3])
                .email(parameters[4])
                .password(parameters[5])
                .phone(parameters[6])
                .userStatus(Digitalization.getInteger(parameters[7]))
                .build();
    }
}
