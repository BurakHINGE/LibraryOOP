public class User {

    private String username;
    private String password;
    private String[][] bookList = new String[1][2];
    private Book book;
    private int librarySize = bookList.length;

    public User(String username, String password, String[][] bookList, int librarySize) {
        this.username = username;
        this.password = password;
        this.bookList = bookList;
        this.librarySize = librarySize;
    }

    public String addBooks(String bookName, String authorName) {

        book = new Book(bookName, authorName);

        String[][] tempList = new String[librarySize][2];

        for (int i = 0; i < bookList.length; i++) {
            for (int j = 0; j < bookList[i].length; j++) {
                tempList[i][j] = bookList[i][j];
            }
        }

        tempList[librarySize][0] = bookName;
        tempList[librarySize][1] = authorName;

        librarySize++;

        return "Book added.";
    }

    public void listBooks(String[][] bookList) {

        for (int i = 0; i < bookList.length; i++) {
            for (int j = 0; j < bookList[i].length; j++) {
                System.out.println(bookList[i] + " - " + bookList[i][j]);
            }
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String[][] getBookList() {
        return bookList;
    }

    public int getLibrarySize() {
        return librarySize;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBookList(String[][] bookList) {
        this.bookList = bookList;
    }

    public void setLibrarySize(int librarySize) {
        this.librarySize = librarySize;
    }
    
}
