import java.lang.reflect.Array;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

// Bài 1: Xóa các ký tự nguyên âm (a,e,i,o,u) trong chuỗi
// Kiểm tra input = rỗng => lỗi

    public  static String removeVowels(String str) {
        if (str == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
// chưa xét tới nguyên âm in hoa
//          char c = str.charAt(i);
//          if (c != 'a' && c != 'e' && c != 'o' && c != 'i' && c != 'u') {
//                sb.append(c);

// Xóa cả nguyên âm in hoa (A,E,I,O,U)
            char c = str.charAt(i);
            char lowerCase = Character.toLowerCase(c);
            if (lowerCase != 'a' && lowerCase != 'e' && lowerCase != 'o' && lowerCase != 'i' && lowerCase != 'u') {
                    sb.append(c);
            }
        }
        return  sb.toString();
    }

// Bài 2: đếm số từ
// Bước 1: Từ chuỗi String ->> mảng các từ trong mảng string
    // ví dụ: "Xin chào các bạn" => ["Xin", "chào", "các", "bạn"]
// Bước 2: dùng length có sẵn của mảng để đếm số lượng item trong mảng

    public static int countWords(String str) {
        String[] words = str.split(" ");
        return words.length;
// có thể dùng 1 câu lnh duy nhất như sau:
//      return str.split(" ").length;


    }

// Bài 3: Đảo ngược chuỗi
    public static String reverseString(String str) {

// Cách 1: dùng for duyệt từ ký tự cuối cùng đi lên đầu chuỗi
    if (str == null) return null;
    StringBuilder sb = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
//      System.out.print(str.charAt(i));
        char c = str.charAt(i);
        sb.append(c);
    }
    return  sb.toString();

// Cách 2: dùng hàm reverse có sẵn trong String
//    return new StringBuilder(str).reverse().toString();

    }

// COLLECTION TRONG JAVA
    public static void learningCollection(){
//      mảng trong Collection
// Cách 1: tạo mảng kèm value cụ thể
        Integer[] arr = {4,2,6,8,9};
        List<Integer> listInt = new ArrayList<>(Arrays.asList(arr));

// Cách 2 chỉ tạo mảng (không kèm value sẵn)
        List<String> listStr = new ArrayList<>();

//     1. Sắp xếp mảng số
//      Tăng dần

        Collections.sort(listInt);
        System.out.println(listInt);

//      Giảm dần
        Collections.sort(listInt, Collections.reverseOrder());
        System.out.println(listInt);

//      Đảo ngược mảng
        Collections.reverse(listInt);
        System.out.println(listInt);

//      Tìm max, min
        System.out.println("Max: "  + Collections.max(listInt));
        System.out.println("Min: "  + Collections.min(listInt));

//      Đếm số lần xuất hiện của item bất kỳ
        System.out.println("Count số 4: " + Collections.frequency(listInt,4));

//      Thêm/ xóa/ sửa item trong list
//      Thêm item vào cuối của listStr
        listStr.add("hello");
        listStr.add("world");
//      Thêm item vào vị trí index nào của mảng
        listStr.add(1,"Phuong");  // 1 là vị trí index thêm // =>> hello Phuong world
        System.out.println(listStr);

//      Đọc item
        System.out.println(listStr.get(1));

//      update
        listStr.set(0,"Hi");
        System.out.println(listStr);

//      xóa item
//        + xóa theo index
        listStr.remove(0);
        System.out.println(listStr);

//        + xóa theo item
        listStr.remove("world");
        System.out.println(listStr);

    }




// Bài 4: Tính tổng các số trong mảng
    public static void sum() {
        List<Integer> list = new ArrayList<>(Arrays.asList(5,3,7,2,9));
        int sum = 0;
        for (int i = 0; i <= list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum: " + sum);

// Tính trung bình:
        double avg = (double) sum/ list.size();
        System.out.println("Avg: " + avg);

    }

    public static void removeSoAm(){
        List<Integer> list = new ArrayList<>(Arrays.asList(3,7,-2,8,9,-4));

// cách 1: dùng for
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) < 0) {
                list.remove(i);
            }
        }
        System.out.println(list);

// cách 2: dùng remove if
//        list.removeIf(num -> num < 0);
//        System.out.println(list);




    }


    public static void main(String[] args) {
// Bài 1: Xóa các ký tự nguyên âm (a,e,i,o,u) trong chuỗi
        String str = "CybERrsoft";
        System.out.println(removeVowels(str));

        String str1 = "hellO";
        System.out.println(removeVowels(str1));

// Bài 2: Đếm số chữ của chuỗi
        String str2 = "Xin chào các bạn";
        System.out.println(countWords(str2));

        String str3 = "Hello World. I am from VN";
        System.out.println(countWords(str3));

// Bài 3: Đảo ngược chuỗi
        String str4 = "Hello";
        System.out.println(reverseString(str4));

        String str5 = "My name's Ha";
        System.out.println(reverseString(str5));

// COLLECTION IN JAVA
       learningCollection();

// Bài 4:

        removeSoAm();





// BÀI TẬP VỀ NHÀ JAVA
// Bài 1:  tính tổng các số chẵn trong mảng
//Bài 2: đếm số từ của 1 chuỗi
//Bài 3: In Chữ Cái Đầu Của Mỗi Từ
//Bài 4: tính thuế















































    }
}