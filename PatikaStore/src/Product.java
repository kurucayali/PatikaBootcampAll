public abstract class Product {
    private int id;
    private String name;
    private double price;
    private double discountRate;
    private int stock;
    private Brand brand;

    public Product(int id, String name, double price, double discountRate, int stock, Brand brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getStock() {
        return stock;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public abstract String toString();
}
