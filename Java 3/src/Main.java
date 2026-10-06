//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
// Bài 1: kiểm tra số có phải là số nguyên tố hay không

// input: 1 số nguyên
// output: số nguyên có phải là số nguyên tố hay không? -> True/False
// process:
// đk bắt đầuvòng lặp: i=2
// đk dừng: i <= n-1
// bước nhảy: i++
// TH1: n < 2 => không là số nguyên tố
// TH2: n = 2 => là số nguyên tố
// TH3: normal
//      + nếu n % i == 0 => không là số nguyên tố => dừng chương trình
//      + ngược lại => duyệt tiếp

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
//        for (int i = 2; i <= number - 1; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
        }
            int i = 2;
            while (i <= number - 1) {
                if (number % i == 0){
                    return false;
                }
                i++;
            }
// duyệt tới number - 1 mà vẫn không hcia hết => chắc chắn là số nguyên tố
        return true;

    }

// Bài 2: tính tổng các chữ số của 1 số
// input: int number
// output: tổng các chữ số của 1 số => int
// process
// ví dụ: 1234
// tách số 4 từ số 1234 => tìm số dư khi chia 10 => 1234 % 10 = 4
// xóa số 4 ra khỏi 1234 => lấy số nguyên khi chia 10 => 1234/10 =123
//...
// đk dừng: number > 0

    public  static int sumDigits(int number) {
        int sum = 0;
//   TH1: nếu number < 0 => dùng abs để convert số âm sang số dương
        int numberAbs = Math.abs(number);

        while (numberAbs > 0) {
            sum += numberAbs % 10;
            numberAbs /= 10;
        }
        return sum;
    }

// Bài 1: in các số trong mảng
    public static void printArray (int[] listNumbers) {
        for (int i =0; i < listNumbers.length;i++) {
            System.out.println(listNumbers[i]);
        }
    }

// Bài 2: in các số chẵn, số lẻ trong mảng
    public static void printChan (int[] listNumbers) {
// cách 1: Dùng for binình thường

//        for (int i = 0; i < listNumbers.length; i++) {
//            if (listNumbers[i] % 2 == 0) {
//                System.out.println(listNumbers[i]);
//            }
//        }

// cách 2: Dùng for cải tiến - duyệt theo item
        for (int number : listNumbers) {
           if (number % 2 == 0) {
             System.out.println(number);
           }
        }
    }

    public static void printLe (int[] listNumbers) {
        for (int i = 0; i < listNumbers.length; i++) {
            if (listNumbers[i] % 2 != 0) {
                System.out.println(listNumbers[i]);
            }
        }
    }

// Bài 3: in các số nguyên tố trong mảng

    public static void printPrimes (int[] listNumbers){
        for (int number : listNumbers) {
            if(isPrime(number)) {
                System.out.println(number);
            }
        }
    }











    public static void main(String[] args) {
// Vòng lặp cơ bản
// 1. Vòng lặp trong mảng dữ liệu
// + số
// + chuỗi
// 2. while, do...while
// 3. Thư viện có sẵn của Java: Collection


// Bài 1: kiểm tra số có phải là số nguyên tố hay không
// số nguyên tố là số chia hết cho 1 và chính nó
// LƯU Ý: Số 2 l số nguyên tố nhỏ nất
// kết quả trả về của hàm phải là boolean (True/False)
     int number = 10;
     boolean check = isPrime(number);
     if (check) { // java tự hiểu (check == true)
         System.out.println("So " + number + " la so nguyen to");
     } else {
         System.out.println("So " + number + " khong la so nguyen to");
     }

// For: dùng khi biết được số lần lặp
// While: khi không biết rõ số lần lặp
// vd: tính tổng các chữ số của 1 số (while)
// Cú pháp while: <đk bắt đầu vòng lặp?
//       while (<đk dừng>){
//           code nằm ở đây
//       <bước nhảy>
//       }


// Bài 2: tính tổng các chữ số của 1 số
// ví dụ: 1234 => tổng 10
// cách 1: nếu vẫn dùng For => convert từ number sang string => dùng function c sẵn cua string để đến số lượng chữ số của 1 số

// cách 2: dùng While để xử lý trực tiếp với number

     int number2 = 1234;
     int sum = sumDigits(number2);
     System.out.println("Tong chu so của " + number2 + " la" + sum);


// vòng lặp trong mảng dữ liệu
    int[] listNumbers = {5,3,7,1,9,10};
// Bài 1: in các số trong mảng    //note: function:dùng Void; tham số: int[]
// Bài 2: in các số chẵn, số lẻ trong mảng
// Bài 3: in các số nguyên tố trong mảng

    System.out.println("Cac so trong mang la: ");
    printArray(listNumbers);

    System.out.println("Cac so chan trong mang la: ");
    printChan(listNumbers);

    System.out.println("Cac so le trong mang la: ");
    printLe(listNumbers);

    System.out.println("Cac so nguyen to trong mang la: ");
    printPrimes(listNumbers);

// Vòng lặp lồng nhau
// Dùng Collection trong Java

// GIT
// - git init: tạo môi trường github local
//=> tạo folder ẩn.git       // LƯU Ý: chỉ dùng 1 lần

// - git commit -m "<tên commit>"
// commit: thể hiện lịch sử thay đổi code
// tạo lịch sử thay đổi code

// - git branch -M <tên branch>
// tạo 1 nhánh code
// tạo branch dựa trên branch chính
// git checkout -b <new branch> <branch chính?


// git remote add originb <link github repository>
// connect github local và github server  => chỉ làm đúng 1 lần thôi nha

// Sau này khi làm git, cần:
// - kiểm tra các file code cần upload lên git => thông qua câu lệnh git status
// - thêm các code change vào lịch sử => câu lệnh: git add <tên file code1><ten file code2>...
// -add toàn bộ code change =>> câu lệnh: git add
// đặt tên commit đó => câu lệnh: git commit -m "<tên commit>"
// git push origin <tên branch>
// LƯU Ý: mỗi lần push code lên git phải nhập username,pasword thì mới cho push
        //=>> để bypass => cần tạo access token để ignore nhập info user






    }
}