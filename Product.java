import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

 class Product {
    private String name;
    private int id;
    private int quantity;
    private int price;
    public Product() {
        name = "None";
        id = 0;
        quantity = 0;
        price = 0;
    }
    public Product(String n, int i, int q, int p) {
        name = n;
        id = i;
        quantity = q;
        price = p;
    }
    public void set(int q) {
        quantity = q;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<Product>();
        System.out.println("How many products would you like to add?");
        int productAmount = input.nextInt();
        input.nextLine();
        for (int i = 0; i < productAmount; i++) {
            System.out.println("Enter your product's name");
            String productName = input.nextLine();

            System.out.println("Enter your product's id");
            int productID = input.nextInt();

            System.out.println("Enter how many of the product you have");
            int productInventory = input.nextInt();

            System.out.println("Enter your product's price");
            int productPrice = input.nextInt();
            input.nextLine();

            products.add(new Product(productName, productID, productInventory, productPrice));
        }

        System.out.print("You have low stock in the following products: ");
        for (int i = 0; i < productAmount; i++) {
            if (products.get(i).getQuantity() < 5) {
                System.out.print(Arrays.toString(new String[]{products.get(i).getName()}) + " ");
            }
        }
        System.out.println("Would you like to restock these products? (y/n)");
        String restock = input.nextLine();
        if (restock.equals("y")) {
            System.out.println("How many items do you want to restock to?");
            int restockAmount = input.nextInt();
            for (int i = 0; i < productAmount; i++) {
                if (products.get(i).getQuantity() < 5) {
                    products.get(i).set(restockAmount);
                }
            }
        }
        else {
            System.out.println("Well you should probably do it soon.");
        }

        int inventoryValue = 0;
        for (int i = 0; i < productAmount; i++) {
            inventoryValue += products.get(i).getPrice();
        }
        System.out.println("The total price of your inventory is: " +inventoryValue);
    }
}
