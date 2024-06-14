import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Warehouse {
    private List<Brand> brands = new ArrayList<>();
    private List<Notebook> notebooks = new ArrayList<>();
    private List<MobilePhone> mobilePhones = new ArrayList<>();

    public Warehouse() {
        initializeBrands();
        initializeProducts();
    }

    private void initializeBrands() {
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));
    }
    private void initializeProducts() {
        notebooks.add(new Notebook(1, "HUAWEI Matebook 14", 17000.0, 10.0, 10, findBrandByName("Huawei"), 16, 512, 14.0));
        notebooks.add(new Notebook(2, "LENOVO V14 IGL", 13699.0, 15.0, 5, findBrandByName("Lenovo"), 8, 1024, 14.0));
        notebooks.add(new Notebook(3, "ASUS T Gaming", 18199.0, 20.0, 3, findBrandByName("Asus"), 32, 2048, 15.6));

        mobilePhones.add(new MobilePhone(1, "SAMSUNG GALAXY A50", 13199.0, 10.0, 50, findBrandByName("Samsung"), 128, 6.5, 4000, 6, "Siyah"));
        mobilePhones.add(new MobilePhone(2, "iPhone 14 Plus 128 GB", 55379.0, 5.0, 30, findBrandByName("Apple"), 128, 6.7, 3046, 8, "Mavi"));
        mobilePhones.add(new MobilePhone(3, "Redmi Note 11 Pro 8GB", 4012.0, 8.0, 20, findBrandByName("Xiaomi"), 128, 6.5, 4000, 12, "Beyaz"));
    }

    public void addNotebook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Model: ");
        String productName = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.print("Discount Rate: ");
        double discountRate = scanner.nextDouble();

        System.out.print("Stock: ");
        int stock = scanner.nextInt();

        System.out.print("Brand: ");
        scanner.nextLine();  // Consume newline

        String brandName = scanner.nextLine();
        Brand brand = findBrandByName(brandName);

        System.out.print("Storage: ");
        int storage = scanner.nextInt();

        System.out.print("Screen: ");
        double screen = scanner.nextDouble();

        System.out.print("Ram : ");
        int ram = scanner.nextInt();

        Notebook notebook = new Notebook(id, productName, price, discountRate, stock, brand, ram, storage, screen);
        notebooks.add(notebook);
        System.out.println("Notebook added successfully.");
    }

    public void addMobilePhone() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Model: ");
        String productName = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.print("Discount Rate: ");
        double discountRate = scanner.nextDouble();

        System.out.print("Stock: ");
        int stock = scanner.nextInt();

        System.out.print("Brand: ");
        scanner.nextLine();  // Consume newline
        String brandName = scanner.nextLine();
        Brand brand = findBrandByName(brandName);

        System.out.print("Storage: ");
        int storage = scanner.nextInt();

        System.out.print("Screen: ");
        double screen = scanner.nextDouble();

        System.out.print("Battery: ");
        int battery = scanner.nextInt();

        System.out.print("Ram: ");
        int ram = scanner.nextInt();

        System.out.print("Color: ");
        scanner.nextLine();  // Consume newline
        String color = scanner.nextLine();

        MobilePhone mobilePhone = new MobilePhone(id, productName, price, discountRate, stock, brand, storage, screen, battery, ram, color);
        mobilePhones.add(mobilePhone);
        System.out.println("Mobile Phone added successfully.");
    }

    public void listNotebooks() {
        System.out.println("Notebook List:");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public void listMobilePhones() {
        System.out.println("Mobile Phone List:");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Pil       | RAM       | Renk      |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (MobilePhone mobilePhone : mobilePhones) {
            System.out.println(mobilePhone);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void deleteProductById(int id) {
        notebooks.removeIf(notebook -> notebook.getId() == id);
        mobilePhones.removeIf(mobilePhone -> mobilePhone.getId() == id);
        System.out.println("Product with ID " + id + " has been removed.");
    }

    private Brand findBrandByName(String name) {
        for (Brand brand : brands) {
            if (brand.getName().equalsIgnoreCase(name)) {
                return brand;
            }
        }
        return null; // Or throw an exception
    }

    public void listBrands() {
        System.out.println("Brands List:");
        brands.sort(Brand::compareTo); // Sort brands alphabetically
        for (Brand brand : brands) {
            System.out.println("- " + brand.getName());
        }
    }
}
