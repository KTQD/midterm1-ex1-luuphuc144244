public abstract class Item {
    public String name;
    private String description;
    protected String ID;
    int price;
    
    public Item(String name, String description, String ID, int price) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void showinfo() {
    }
}
