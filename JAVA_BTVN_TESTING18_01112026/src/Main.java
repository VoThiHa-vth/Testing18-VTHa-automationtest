import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//  CẤP ĐỘ 1:
//    B1-1: Xóa Nguyên Âm Trong Chuỗi
//    B1-2: Tìm Giá Trị Lớn Thứ Hai Trong Mảng
//    B1-3: tính tổng các số chẵn trong mảng
//    B1-4: đếm số từ của 1 chuỗi
//    B1-5: In Chữ Cái Đầu Của Mỗi Từ

//  CẤP ĐỘ 2:
//    B2-1: Tính thuế
//        1.Thu nhập từ 0 đến 5 triệu đồng: 5%
//        2.Thu nhập từ 5 triệu đến 10 triệu đồng: 10%
//        3.Thu nhập từ 10 triệu đến 18 triệu đồng: 15%
//        4.Thu nhập từ 18 triệu đến 32 triệu đồng: 20%
//        5.Thu nhập từ 32 triệu đến 52 triệu đồng: 25%
//        6.Thu nhập từ 52 triệu đến 80 triệu đồng: 30%
//        7.Thu nhập trên 80 triệu đồng: 35%
//    B2-2: Kiểm tra chuỗi đối xứng
//    B2-3: Xóa Ký Tự Lặp Lại Trong Chuỗi

//  CẤP ĐỘ 3:
//    B3-1: Two Sum II - Input Array Is Sorted
//    B3-2: Longest Palindromic Substring
//    B3-3: Minimum Window Substring
// END================================================================================




//    B1-1: Xóa Nguyên Âm Trong Chuỗi
    public static String removeVowels(String str) {
        if (str == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            char lowerCase = Character.toLowerCase(c);
            if (lowerCase != 'a' && lowerCase != 'e' && lowerCase != 'o' && lowerCase != 'i' && lowerCase != 'u') {
                sb.append(c);
            }
        }
        return  sb.toString();
    }

//    B1-2: Tìm Giá Trị Lớn Thứ Hai Trong Mảng
    public static void soLonThuHai(int[] arr) {
        if (arr.length < 2 ) {
            System.out.println("List có ít hơn 2 số nên output giá trị sau: " + Integer.MIN_VALUE);
            return;
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int secondMax = arr[i];

            if (secondMax > max1){
                max2 = max1;
                max1 = secondMax;
            } else if (secondMax < max1 && secondMax > max2)  {
                max2 = secondMax;
            }
        }
        System.out.println("Số lớn thứ hai của list là: " + max2);
    }

//    B1-3: tính tổng các số chẵn trong mảng
// Cách 1: Mảng cho sẵn giá trị cụ thể
    //public static void sumChan () {
    //    List<Integer> list = new ArrayList<>(Arrays.asList(5,3,7,2,9,4));
    //    int sumChan = 0;
    //    for (int i = 0; i < list.size(); i++) {
    //        int numChan = list.get(i);
    //        if (numChan % 2 == 0) {
    //            sumChan += numChan;
    //        }
    //    }
    //    System.out.println("Tổng số chẵn của list là: " + sumChan);
    //}
// Cách 2: Mảng giá trị từ 0 -> n
    public static void sumChan (int n) {
        int sumChan = 0;
        for (int i = 0; i <= n; i++) {
            int numChan = i;
            if (numChan % 2 == 0) {
                sumChan = sumChan + i;
            }
        }
        System.out.println("Tổng số chẵn của list là: " + sumChan);
    }


//    B1-4: đếm số từ của 1 chuỗi
    public static int countWords(String str) {
        String[] words = str.split(" ");
        return words.length;
    }


//    B1-5: In Chữ Cái Đầu Của Mỗi Từ
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


//    B2-1: Tính thuế
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

//    B2-2: Kiểm tra chuỗi đối xứng
    public static void checkDoiXung (String str){
        boolean doiXung = true;
        for (int i = 1; i < str.length() / 2; i++){
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                doiXung = false;
                System.out.println(doiXung + " là chuỗi không đối xứng");
                return;
            }
        }
        System.out.println(doiXung + " là chuỗi đối xứng");
    }

//    B2-3: Xóa Ký Tự Lặp Lại Trong Chuỗi
    public static void removeDoubleLetters (String str){
        String result1 = "";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            char lowerCase = Character.toLowerCase(c);
            boolean isExit = false;

            for (int j = 0; j < result1.length(); j++) {
                if (lowerCase == result1.charAt(j)) {
                    isExit = true;
                    break;
                }
            }

            if (isExit == false) {
                result1 = result1 + lowerCase;
            }
       }
        System.out.println("Chuỗi sau khi xóa ký tự lặp lại là: " + result1);
    }


//    B3-1: Two Sum II - Input Array Is Sorted
    public static void sumEqualTarget(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++){
                if (numbers[i] + numbers [j] == target){
                    System.out.println("[" + (i + 1) + ", " + (j + 1) + "]");
                    return;
                }
            }
        }
    }


//    B3-2: Longest Palindromic Substring
    public static String doiXung (String str, int left, int right){
        if (left < 0 || right >= str.length()
                || str.charAt(left) != str.charAt(right)) {
            return str.substring(left + 1, right);
        }

        return doiXung(str, left - 1, right + 1);
    }


//    B3-3: Minimum Window Substring
    // Tham khảo GPT nhưng không hiểu :(((




    public static void main(String[] args) {

//    B1-1: Xóa Nguyên Âm Trong Chuỗi
        String str = "CybERrsoft";
        System.out.println(removeVowels(str));

        String str1 = "hellO";
        System.out.println(removeVowels(str1));

//    B1-2: Tìm Giá Trị Lớn Thứ Hai Trong Mảng
        int[] arr1 = {1, 3, 4, 5, 0, 2};
        soLonThuHai(arr1);

        int[] arr2 = {10, 5, 10};
        soLonThuHai(arr2);

        int[] arr3 = {3};
        soLonThuHai(arr3);

//     B1-3: tính tổng các số chẵn trong mảng
// Cách 1: Mảng cho sẵn giá trị cụ thể
//        sumChan();

// Cách 2: Mảng giá trị từ 0 -> n
         int n = 10;
       sumChan(n);

//    B1-4: đếm số từ của 1 chuỗi
        String str2 = "Xin chào các bạn";
        System.out.println(countWords(str2));

        String str3 = "Hello My friends. I am from Viet Nam";
        System.out.println(countWords(str3));

//    B1-5: In Chữ Cái Đầu Của Mỗi Từ
        String str4 = "Xin chào các bạn";
        System.out.println(getFirstLetters(str4));

        String str5 = "Hello World. I am from Viet Nam";
        System.out.println(getFirstLetters(str5));

//    B2-1: Tính thuế
//        double income = 87_000_000;
        System.out.println("Mời nhập thu nhập hàng năm (đồng): " );
        tinhThue();

//    B2-2: Kiểm tra chuỗi đối xứng
        String str6 = "Hello";;
        checkDoiXung(str6);

        String str7 = "Madam";
        checkDoiXung(str7);

//    B2-3: Xóa Ký Tự Lặp Lại Trong Chuỗi
        String str8 = "prograMming";
        removeDoubleLetters(str8);

        String str9 = "haxinhbinhthuong";
        removeDoubleLetters(str9);

//    B3-1: Two Sum II - Input Array Is Sorted
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        sumEqualTarget(numbers, target);

        int[] numbers2  = {1, 5, 6, 10};
        int target2 = 16;
        sumEqualTarget(numbers2, target2);

//    B3-2: Longest Palindromic Substring

        String str10 = "cbbabjbad2";
        String result = "";

        for (int i = 0; i < str10.length(); i++) {
            String sub1 = doiXung(str10, i, i);
            String sub2 = doiXung(str10, i, i + 1);

            if (sub1.length() > result.length()) {
                result = sub1;
            }

            if (sub2.length() > result.length()) {
                result = sub2;
            }
        }
        System.out.println("Chuỗi đối xứng dài nhất là: " + result);


    }
}