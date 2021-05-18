package productShop.Model;

public class Product {
    protected int id;
    protected String name;
    protected double price;
    protected int qty;

    public Product(int id) {
        this.id = id;
    }

    public Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString () {
        return String.format("%-30d%-30d%-30d%-30d", id, name, price, qty);
    }
}
