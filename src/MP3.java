public class MP3 extends Item {
    public int duration;
    public MP3(String name, String description, String ID, int price, int duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }
    public void showinfo(){
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + price);
        System.out.println("Duration: " + duration);
    }
}
