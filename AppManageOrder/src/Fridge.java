import java.util.Scanner;

public class Fridge extends Orders {
    private int capacity;
    private String color;
    private String brand;
    private int number;
    private float unitPrice;

    public Fridge(String name, int code, String country, int capacity, String color, String brand, int number, float unitPrice){
        super(name, code, country);
        this.capacity = capacity;
        this.color = color;
        this.brand = brand;
        this.number = number;
        this.unitPrice = unitPrice;
    }

    public Fridge() {

    }

    public Fridge(String name, int code, String country) {
        super(name, code, country);
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(){
        this.capacity = capacity;
    }

    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }
    public  String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand = brand;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(){
        this.number = number;
    }
    public float getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(){
        this.unitPrice = unitPrice;
    }
    public void importFridge(){
        super.importOrders();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input capacity: ");
        capacity = Integer.parseInt(String.valueOf(sc.nextInt()));
        sc.nextLine();
        System.out.print("Input color: ");
        color = sc.nextLine();
        System.out.print("Input brand: ");
        brand = sc.nextLine();
        System.out.print("Input number: ");
        number= Integer.parseInt(String.valueOf(sc.nextInt()));
        System.out.print("Input unitPrice: ");
        unitPrice = sc.nextFloat();
    }
    public void showFridge(){
        super.showOrders();
        System.out.println("capacity: " + capacity+ "| color: " + color + "| brand: " + brand + "| number: " + number + "| unitPrice: " + unitPrice );
    }

    public float caculateBill(){
        return number * unitPrice;
    }
    @Override
    public String toString(){
        return  "Fridge: [capacity=" + capacity + ", brand= " + brand + ", color=" + color + ", unitPrice=" + unitPrice + ", number=" + number + "]";
    }
}
