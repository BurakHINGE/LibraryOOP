import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JsonManager {

    private static final String FILE_NAME = "users.json";

    public static void saveUsers(ArrayList<User> users) {

        try (FileWriter writer = new FileWriter(FILE_NAME)) {

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(users, writer);

        } catch (Exception e) {
            System.out.println("JSON kaydedilirken hata oluştu.");
        }
    }

    public static ArrayList<User> loadUsers() {

        try (FileReader reader = new FileReader(FILE_NAME)) {

            Gson gson = new Gson();
            Type userListType = new TypeToken<ArrayList<User>>(){}.getType();

            ArrayList<User> users = gson.fromJson(reader, userListType);

            if (users == null) {
                return new ArrayList<>();
            }

            return users;

        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}