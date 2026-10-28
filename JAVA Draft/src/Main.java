import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
// Ví dụ 2: Kiểm tra số chẵn hay số lẻ trong java
    public static void checkChanLe (int num5){
        if (num5 % 2 == 0){
            System.out.println(num5 + " là số chẵn");
        }else {System.out.println(num5 + " là số lẻ");}
   }

//Ví dụ 3: Kiểm tra năm nhuận trong java
    public static void namNhuan (int year) {
        if (year % 4 == 0) {
            if(year % 100 == 0) {
                if (year % 400 == 0) {
                System.out.println(year + " là năm nhuận");
                } else
                System.out.println(year + " không phải là năm nhuận");
            }
        } else {
            System.out.println(year + " không phải là năm nhuận");
        }
    };

//Ví dụ 4: Kiểm tra nguyên âm phụ âm trong java
//    public static void checkNguyenPhu (String str){
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Nhập ký tự cần kiểm tra: ");
//        char ch= sc1.next().charAt(0);
//        char lowerCase = Character.toLowerCase(ch);
//        if (lowerCase == 'a' || lowerCase == 'i' || lowerCase == 'o' || lowerCase == 'u' || lowerCase == 'e' ){
//            System.out.println(str + " là nguyên âm");
//
//        } else {
//            System.out.println(str + " không phải là nguyên âm");
//        }
//        return;
//    }

//Ví dụ 5: Xóa khoảng trắng của một chuỗi có sẵn
//    public static void deleteSpace (){
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        System.out.println("Input chuỗi: " + input);
//
//        input = input.replaceAll(" ","");
//
//        System.out.println("Chuỗi sau khi xóa space alf: " + input);
//
//    }

//Ví dụ 6: 1. In hoa ký tự đầu tiên của một chữ
    public static void upperCaseLetter (String str){
        String result = "";

        for (int i = 0; i < str.length(); i++){
            if (i == 0 || str[i-1] == ' '){

            }
        }

    }







    public static void main(String[] args) {

//        Ví dụ 1: Cộng hai số trong Java
        int num1 = 5;
        int num2 = 6;
        System.out.println("Tổng 2 số là: " + (num1 + num2));

// Dùng scanner nhé:
        int num3, num4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        num3 = sc.nextInt();

        System.out.println("Nhập số thứ hai: ");
        num4 = sc.nextInt();
        sc.close();

        System.out.println("Tổng 2 số là: " + (num3 + num4));

// Ví dụ 2: Kiểm tra số chẵn hay số lẻ trong java
        int num5 = 1984396;
        checkChanLe(num5);

//Ví dụ 3: Kiểm tra năm nhuận trong java
        int year = 2000;
        namNhuan(year);

        int year1 = 2001;
        namNhuan(year1);

//Ví dụ 4: Kiểm tra nguyên âm phụ âm trong java
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Nhập ký tự cần kiểm tra: ");
//        String str = sc1.next();
//        checkNguyenPhu(str);

//Ví dụ 5: Xóa khoảng trắng của một chuỗi có sẵn
//        deleteSpace();

//Ví dụ 6: Cách viết hoa ký tự đầu tiên trong Java







    }
}