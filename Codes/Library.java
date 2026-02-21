import java.util.ArrayList;

public class Library {

    private ArrayList<User> users;
    
    public Library() {
        users = JsonManager.loadUsers();
    }
    

    public boolean register(String username, String password) {

        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }

        User newUser = new User(username, password);
        users.add(newUser);
        JsonManager.saveUsers(users);
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

    public String isAllowedPassword(String password) {

        int capitalLetter = 0;
        int lowerCaseLetter = 0;
        int specialCharacter = 0;


        if (password.length() < 8) {

            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    capitalLetter++;
                }
                else if (Character.isLowerCase(password.charAt(i))) {
                    lowerCaseLetter++;
                }
                else if (!Character.isLetterOrDigit(password.charAt(i))) {
                    specialCharacter++;
                }
            }
            
            if (capitalLetter < 1 && lowerCaseLetter < 1 && specialCharacter < 1) {
                return "allReqDenied";
            }
            else if (capitalLetter < 1 && lowerCaseLetter < 1 && specialCharacter > 0) {
                return "capitalLower";
            }
            else if (capitalLetter < 1 && lowerCaseLetter > 0 && specialCharacter < 1) {
                return "capitalSpecial";
            }
            else if (capitalLetter > 0 && lowerCaseLetter < 1 && specialCharacter < 1) {
                return "lowerSpecial";
            }
            else if (capitalLetter > 0 && lowerCaseLetter > 0 && specialCharacter < 1) {
                return "special";
            }
            else if (capitalLetter > 0 && lowerCaseLetter < 1 && specialCharacter > 0) {
                return "lower";
            }
            else if (capitalLetter < 1 && lowerCaseLetter > 0 && specialCharacter > 0) {
                return "capital";
            }
            else {
                return "allowed";
            }
    
        }
        else {
            return "shortPass";
        }
        
    }

    public ArrayList<User> getUsers() {
        return users;
    }


}
