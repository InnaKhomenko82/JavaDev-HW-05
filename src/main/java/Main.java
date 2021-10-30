
import controller.ConsoleController;
public class Main {

    public static void main(String[] args) {
        ConsoleController.mainMenu();

        /*BaseConnection.retrofitClient();

        User userForInsert = UserService.userBuilder();
        RetrofitConfig.execute(retrofitClient().addEntity(userForInsert));
        Call<User> user = retrofitClient().getUserByUserName("user");
        System.out.println(user);*/
    }
}
