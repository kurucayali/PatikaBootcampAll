import java.util.ArrayList;
import java.util.Scanner;

public class WareHouse {
    ArrayList<MobilePhone> mobilePhonesInStock = new ArrayList<>();
    ArrayList<Laptop> laptopsInStock = new ArrayList<>();


    public void addLaptop() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter laptop details:");

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Model: ");
        String productName = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Storage: ");
        int storage = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Screen: ");
        double screen = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ram : ");
        int ram = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        Laptop laptop = new Laptop(id, productName, price, brand, storage, screen, ram, quantity);
        laptopsInStock.add(laptop);

        System.out.println("Laptop added successfully.");
    }


    public void addMobilePhone() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter mobile phone details:");

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Model: ");
        String productName = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Storage: ");
        int storage = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Screen: ");
        double screen = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Camera : ");
        int camera = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Battery Capacity: ");
        int batteryCap = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ram: ");
        int ram = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Color: ");
        String color = scanner.nextLine();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        MobilePhone mobilePhone = new MobilePhone(id, productName, price, brand, storage, screen, camera, batteryCap, ram, color, quantity);
        mobilePhonesInStock.add(mobilePhone);
        System.out.println("Mobile phone added successfully.");
    }

    public void listLaptops() {
        System.out.println("Laptops in stock:");
        for (Laptop laptop : laptopsInStock) {
            System.out.println(laptop.toString());
        }
    }

    public void listMobilePhones() {
        System.out.println("Mobile phone in stock:");
        for (MobilePhone mobilePhone : mobilePhonesInStock) {
            System.out.println(mobilePhone.toString());
        }
    }




}
