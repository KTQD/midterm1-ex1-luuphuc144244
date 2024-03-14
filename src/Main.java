public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("File MP3", "Nhac nuoc ngoai", "0001", 100, 120);
        Book book = new Book("File Book", "Truyen ngan ban chay", "0002", 200, "Nguyen Anh", 180,"Truyen ngan");
        mp3.showinfo();
        book.showinfo();
    }
}
