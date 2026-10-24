import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    BTVN JAVA:
//    B1: tính tổng các số chẵn trong mảng
//    B2: đếm số từ của 1 chuỗi
//    B3: In Chữ Cái Đầu Của Mỗi Từ
//    B4: Tính thuế
//        1.Thu nhập từ 0 đến 5 triệu đồng: 5%
//        2.Thu nhập từ 5 triệu đến 10 triệu đồng: 10%
//        3.Thu nhập từ 10 triệu đến 18 triệu đồng: 15%
//        4.Thu nhập từ 18 triệu đến 32 triệu đồng: 20%
//        5.Thu nhập từ 32 triệu đến 52 triệu đồng: 25%
//        6.Thu nhập từ 52 triệu đến 80 triệu đồng: 30%
//        7.Thu nhập trên 80 triệu đồng: 35%
//    Yêu cầu:
//        1.Nhập thu nhập hàng năm từ người dùng.
//        2.Tính số thuế phải trả.

//    B1: tính tổng các số chẵn trong mảng
    public static void sumChan () {
        List<Integer> list = new ArrayList<>(Arrays.asList(5,3,7,2,9,4));
        int sumChan = 0;
        for (int i = 0; i < list.size(); i++) {
            int numChan = list.get(i);
            if (numChan % 2 == 0) {
                sumChan += numChan;
            }
        }
        System.out.println("Tổng số chẵn của list là: " + sumChan);
    }


//    B2: đếm số từ của 1 chuỗi
    public static int countWords(String str) {
        String[] words = str.split(" ");
        return words.length;
    }


//    B3: In Chữ Cái Đầu Của Mỗi Từ
    public static String getFirstLetters(String str) {
        String[] listWord = str.split(" ");
        String result = "";
        for (int i = 0; i < listWord.length; i++) {
            String tu = listWord[i];
            char firstLetter = tu.charAt(0);
            result = result + firstLetter + " ";
        }
        return result;
    }


//    B4: Tính thuế
    public static void tinhThue(){
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();

        if (income <= 0){
            System.out.println("Mức thu nhập không hợp lệ");
            return;
        }
        double totalTax = 0;
        if (income <= 5_000_000) {
            totalTax = (double) (0.05 * income);
        } else if (5_000_001 <= income && income <= 10_000_000) {
            totalTax = (5_000_000 * 0.05) + (double) (0.1 * (income - 5_000_000));
        } else if (10_000_001 <= income && income <= 18_000_000) {
            totalTax = (5_000_000 * 0.05) + ((10_000_000 - 5_000_000) * 0.1) + (double) (0.15 * (income - 10_000_000));
        } else if (18_000_001 <= income && income <= 32_000_000) {
            totalTax = (5_000_000 * 0.05) + ((10_000_000 - 5_000_000) * 0.1) + ((18_000_000 - 10_000_000) * 0.15) + (double) (0.2 * (income - 18_000_000));
        } else if (32_000_001 <= income && income <= 52_000_000) {
            totalTax = (5_000_000 * 0.05) + ((10_000_000 - 5_000_000) * 0.1) + ((18_000_000 - 10_000_000) * 0.15) + ((32_000_000 - 18_000_000) * 0.2) +(double) (0.25 * (income - 32_000_000));
        } else if (52_000_001 <= income && income <= 80_000_000) {
            totalTax = (5_000_000 * 0.05) + ((10_000_000 - 5_000_000) * 0.1) + ((18_000_000 - 10_000_000) * 0.15) + ((32_000_000 - 18_000_000) * 0.2) + ((52_000_000 - 32_000_000) * 0.25) + (double) (0.3 * (income - 52_000_000));
        } else {
            totalTax = (5_000_000 * 0.05) + ((10_000_000 - 5_000_000) * 0.1) + ((18_000_000 - 10_000_000) * 0.15) + ((32_000_000 - 18_000_000) * 0.2) + ((52_000_000 - 32_000_000) * 0.25) + ((80_000_000 - 52_000_000) * 0.3) + (double) (0.35 * (income - 80_000_000));
        }
        System.out.println("Tien thue:" + totalTax);
    }








    public static void main(String[] args) {
//     B1: tính tổng các số chẵn trong mảng
       sumChan();

//    B2: đếm số từ của 1 chuỗi
        String str = "Xin chào các bạn";
        System.out.println(countWords(str));

        String str1 = "Hello World. I am from VN";
        System.out.println(countWords(str1));

//    B3: In Chữ Cái Đầu Của Mỗi Từ
        String str2 = "Xin chào các bạn";
        System.out.println(getFirstLetters(str2));

        String str3 = "Hello World. I am from Viet Nam";
        System.out.println(getFirstLetters(str3));

//    B4: Tính thuế
//        double income = 87_000_000;

        System.out.println("Mời nhập thu nhập hàng năm (đồng): " );
        tinhThue();


    }
}