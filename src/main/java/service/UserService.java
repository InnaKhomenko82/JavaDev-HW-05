package service;

import controller.BaseConnection;
import controller.ConsoleController;
import models.ApiResponse;
import models.User;
import util.Digitalization;
import util.RetrofitConfig;

import java.util.ArrayList;
import java.util.List;

public class UserService implements BaseService<User, Long> {

    RetrofitUser retrofitUser = BaseConnection.retrofitClient(RetrofitUser.class);

    @Override
    public User createEntity(Class<User> eClass,User user) {
        return RetrofitConfig.execute(retrofitUser.addEntity(user));
    }

    public String createUserWithList(List<User> users){
        return RetrofitConfig.execute(retrofitUser.createWithList(users)).getMessage();
    }

    public String createWithArray(User[] users){
        return RetrofitConfig.execute(retrofitUser.createUserWithArray(users)).getMessage();
    }

    @Override
    public User readById(Class<User> eClass, Long id) {
        return null;
    }

    @Override
    public User readByName(Class<User> eClass, String name) {
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
        return RetrofitConfig.execute(retrofitUser.userLogout());
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

    public static List<User> userListBuilder(){
        boolean building = true;
        List<User> users = new ArrayList<>();
        while(building){
            User user = userBuilder();
            System.out.println("Add new user: " + user);
            users.add(user);
            System.out.println("Enter any symbol to continue or 'N' to close the list");
            String[] command = ConsoleController.read();
            if ("N".equalsIgnoreCase(command[0])) building = false;
        }
        return users;
    }

    public static User[] userArrayBuilder(){
        System.out.println("Insert array with user details:\n" +
                "id|userName|firstName|lastName|email|password|phone|userStatus;\n" +
                "id|userName|firstName|lastName|email|password|phone|userStatus");
        String[] usersString = ConsoleController.readArray();
        User[] usersArray = new User[usersString.length];
        for (int i=0; i<usersString.length; i++) {
            String[] parameters = usersString[i].split("\\|");
            usersArray[i] = User.builder()
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
        return usersArray;
    }
}
