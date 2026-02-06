import java.util.ArrayList;

public class User {

    private String username;
    private String password;
    private ArrayList<Book> bookList;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.bookList = new ArrayList<>();
    }

    public String addBooks(String bookName, String authorName) {

        Book newBook = new Book(bookName, authorName);
        bookList.add(newBook);

        return "Kitabınız kitaplığınıza eklendi.";
    }

    public void listBooks() {

        for (Book book : bookList) {
            System.out.println(book.getBookName() + " - " + book.getAuthorName());
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
