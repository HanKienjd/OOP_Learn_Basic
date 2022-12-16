import java.util.Scanner;

public class Orders {
    private String name;
    private int code;
    private String country;

    public Orders(String name, int code, String country){
        this.code = code;
        this.country = country;
        this.name = name;
    }

    public Orders() {

    }


    public int getCode(){
        return code;
    }
    public void setCode(int code){
        this.code = code;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void importOrders(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input nameOrder: ");
        name = sc.nextLine();
        System.out.print("Input codeOrder: ");
        code = Integer.parseInt(String.valueOf(sc.nextInt()));
        sc.nextLine();
        System.out.print("Input countryOrder: ");
        country = sc.nextLine();
    }

    public void showOrders(){
        System.out.println("nameOrder: " + name + "|" + "codeOrder: " + code + "|" + "countryOrder: " + country);
    }
    @Override
    public String toString(){
        return "Orders: [codeOrders=" + code + ", countryOrders:" + country + ", nameOrders: " + name + "]";
    }
}
