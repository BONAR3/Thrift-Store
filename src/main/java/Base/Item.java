package Base;

abstract public class Item {

    private int Id;
    private double price;
    private String name;
    private String description;

    public Item(int id, double price, String name, String description) {
        Id = id;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public Item (){

    }

}
