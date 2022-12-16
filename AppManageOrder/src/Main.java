import java.util.Scanner;

public class Main {

    public static void run(){
        Fridge items[] = null;
        int countItem = 0, choose;
        do{
            System.out.println("1: Nhập danh sách tủ lạnh: ");
            System.out.println("2: In danh sách tủ lanh đã nhập");
            System.out.println("3: Liệt kê danh sách tủ lạnh theo hãng sản xuất: ");
            System.out.println("4: Tính tổng tiền tất cả tủ lạnh");
            System.out.println("5: In các tủ lạnh có dung tích > 200l");
            System.out.println("6: Sắp xếp tủ lanh theo số lượng giảm dần");
            System.out.println("7: Sửa thông tin tủ lạnh theo mã hàng");
            System.out.print("8: Nhập lựa chọn của bạn: ");
            Scanner sc = new Scanner(System.in);
            choose = sc.nextInt();
            switch (choose){
                case 1: 
                    System.out.print("Nhập số lượng tủ lạnh: ");
                    countItem = sc.nextInt();
                    items = new Fridge[countItem];
                    for (int i = 0; i < countItem; i++){
                        items[i] = new Fridge();
                        items[i].importFridge();
                    }
                    break; 
                case 2: 
                    for (int i = 0; i < countItem; i++){
                        items[i].showFridge();
                    }
                    break;
                case 3: 
                    System.out.print("Nhập hãng sản xuât: ");
                    String brand = sc.nextLine();
                    for (int i = 0; i < countItem; i++){
                        if(items[i].getBrand().equals(brand)){
                            items[i].showFridge();
                        }
                    }
                    break;
                case 4: 
                    int sum = 0;
                    for(int i = 0 ; i < countItem; i++){
                        sum+=items[i].caculateBill();
                    }
                    System.out.println("Sum : "+ sum);
                    break;
                case 5: 
                    for (int i = 0; i < countItem; i++){
                        if(items[i].getCapacity() > 200){
                            items[i].showFridge();
                        }
                    }
                    break;
                case 6:
                    for(int i = 0; i < countItem - 1 ; i++){
                        for(int j = i + 1; j < countItem; j++){
                            if(items[i].getNumber() < items[j].getNumber()){
                                Fridge temp = items[i];
                                items[i] = items[j];
                                items[j] = temp;
                            }
                        }
                    }
                    for (int i = 0 ; i < countItem; i++){
                        items[i].showFridge();
                    }
                   break;
                case 7:
                    System.out.print("Nhập mã cần sửa = ");
                    int code = sc.nextInt();
                    for(int i = 0; i < countItem - 1; i++){
                        if(items[i].getCode() == code){
                            items[i].importFridge();
                        }
                    }
                    break;
                default:
                    System.out.println("Nhập sai lựa chọn");
                    break;
            }
        }while (choose!=0);

    }
    public static void main(String[] args) {
        run();
    }
}