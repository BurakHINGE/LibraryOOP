import java.util.ArrayList;

public class Library {

    ArrayList<User> users;
    
    public Library() {
        users = new ArrayList<>();
    }
    

    public boolean register(String username, String password) {

        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }

        User newUser = new User(username, password);
        users.add(newUser);
        return true;
    }

    public User login(String username, String password) {

        for (User user : users) {

            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {

                return user;
            }

        }

        return null;
    }


}
