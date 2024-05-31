public class MobilePhone {
    private int id;
    private String productName;
    private double price;
    private String brand ;
    private int storage;
    private double screen;
    private int camera;
    private int batteryCap;
    private int ram;
    private String color;
    private int quantity;

    public MobilePhone(int id, String productName,  double price,String brand, int storage, double screen, int camera, int batteryCap, int ram, String color, int quantity) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.brand = brand;
        this.storage = storage;
        this.screen = screen;
        this.camera = camera;
        this.batteryCap = batteryCap;
        this.ram = ram;
        this.color = color;
        this.quantity=quantity;


    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBatteryCap() {
        return batteryCap;
    }

    public void setBatteryCap(int batteryCap) {
        this.batteryCap = batteryCap;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
