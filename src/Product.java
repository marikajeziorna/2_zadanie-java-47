
public class Product {

    private String name;
    private String producer;
    private double price;

    public Product(String name, String producer, double price) {
        this.name = name;
        this.producer = producer;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ";" + producer + ";" + price + "\n";
    }
}
