public class Book extends Item{
    public String author;
    public int numberOfPages;
    public String genre;
    public Book(String name, String description, String ID, int price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }
    public void showinfo(){
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println("Genre: " + genre);
    }
}
