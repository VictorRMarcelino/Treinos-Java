package marketSystem;

import java.util.Scanner;

public class product {
    static String name;
    static String addNewProduct;
    static double price;
    static String[] nameList = new String[3];
    static double[] priceList = new double[3];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        doYouWantToAddANewProduct();
    }

    public static void doYouWantToAddANewProduct(){
        System.out.println("Do you want to add a new product to the list? ");
        addNewProduct = scanner.nextLine();
        switch (addNewProduct){
            case "yes" ->{
                enterAProduct();
            }
            case "no" ->{
                printLists();
            }
        }
    }

    public static void enterAProduct(){
        System.out.println("Enter the name of the product: ");
        name = scanner.nextLine();
        try {
            int j = 1;
            for (int i = 0; i < nameList.length; i++) {
                nameList[i] = name;
            }
            enterThePriceOfTheProduct();
        }catch (Exception e){
            System.out.println("Erro ao adicionar produto na lista! " + e);
        }
    }

    public static void enterThePriceOfTheProduct(){
        System.out.println("Enter the price of the product: ");
        price = scanner.nextDouble();
        for(int i = 0; i < priceList.length; i++){
            priceList[i] = price;
        }
        doYouWantToAddANewProduct();
    }

    public static void printLists(){
        System.out.println("Final List");
        for(int i = 0; i < nameList.length; i++){
            System.out.println("Product: " + nameList[i] + " Price " + priceList[i]);
        }
        calcFinalPrice();
    }

    public static void calcFinalPrice(){
        System.out.println("---------------");
        System.out.println("Total: ");
        int sum =0;
        for(int i = 0; i < priceList.length; i++){
            sum += priceList[i];
        }
        System.out.print(sum);
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
}
