import java.net.PasswordAuthentication;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//  Ctrl+/
// 1. Câu lệnh nhâp/ xuất dữ liệu
// Xuất
        System.out.println("Hello World");

// Biến (Variable)
// <Kiểu dữ liệu> <Tên biến>;
// <Kiểu dữ liệu> <Tên biến> = <giá trị mặc định>;
// Quy tắc đặt tên biến: camel case
// VD: soNguyen, hocSinh,.....
        int num1 = 10;
        System.out.println(num1);

        float num2 = 10.5f;
        boolean isTrue = true;
        boolean isActive = true;
        System.out.println(isActive);
        char ch = 'a';
        String str = "Hello World";
        System.out.println(str);

// 2. Các toán tử
// 2.1. Phép toán +,-,*,/(chia lấy nguyên),%(lấy dư)
// Cộng số nguyên, cộng số thực, nối chuỗi
        int number1 = 10;
        int number2 = 20;
        int result = number1 + number2;
        System.out.println("Tổng 2 số nguyên là:" + result);

// ++ =>> tăng giá trị biến đó lên 1 đơn vị

// number 1 = number 1+1 =>> number1++
// gán giá trị number1 vào number3, sau đó tăng giá trị của number1 lên 1 đơn vị
// Tức là: number3=10 ; number1= 11 (gán trước rồi cộng)
        int number3 = number1++;
        System.out.println("number3=" + number3);
        System.out.println("number1=" + number1);

// tăng giá trị number2 lên 1 đơn vị
// sau đó gán giá trị number2 vào number4
// number2 = number4 = 21 (cộng trước rồi mới gán)
        int number4 = ++number2;
        System.out.println("number2=" + number2);


// Phép trừ tương tự phép +
// number -- / --number
        number1 += 10; // number1 = number1 + 10
        number1 -= 10; // number1 = number1 - 10
        number1 = number2 + 10; // ghi đầy đủ

// phép nhân không có number1** và **number1
// phép chia không có number1// v //number1
// nhưng có nhân/chia tự thân và được viết tắt như cộng/trừ
// ví dụ:
        number1 *= 10;
        number1 /= 10;
        number1 %= 10;
// Hằng số (constant) -> biến lưu giá trị không đổi. Dùng hàm Final nhé
// DÙng lưu địa chỉ trang web, timeout, locator/element (phần tử trên trang web: logo, item, button...)
// Dùng hàm Final nha
//    Final int TIMEOUT = 1000;

// 2.2 So sánh: >,>=,<,<=,==,!=,!(phủ định)
// Kết quả trả về ->boolean
        boolean isGreater = 10 > 5;
        boolean isEqual = 10 == 10;
        // =>> đi kèm với condition statement, loop statement

// 2.3. nối nhiều điều kiện: &&,||
// Kết quả trả về ->boolean
// Điều kiện &&: True khi all cùng True, False khi 1 trong các điều kiện False
// Điều kiện ||: False khi all cùng False, True khi 1 trong các điều kiện là True
        boolean isCheck = (10 > 5) && (10 < 20); // True
        boolean isCheck2 = (10 > 5) || (10 < 20); // True

// 3. Nhập dữ liệu -> nhập dữ liệu từ bàn phím
// Dùng đối tượng Scanner
        Scanner sc = new Scanner(System.in);

// nhập số nguyên
// next... => là hàm bất đồng bộ
// tức là bắt user nhập giá trị từ bàn phìm và gõ Enter rồi mớ xử lý

// Goi API => bất đồng bộ

        System.out.println("Moi ban nhap so nguyen:");
        int number5 = sc.nextInt();
        System.out.println("So nguyen ban nhap la:" + number5);

// Nhập số thực
        System.out.println("Moi ban nhap so thuc:");
        float number6 = sc.nextFloat();
        System.out.println("So thuc ban nhap la:" + number6);

// Nhập chuỗi
        System.out.println("Moi ban nhap chuoi:");
        String str1 = sc.nextLine();
        System.out.println("Chuoi ban nhap la:" + str1);
//---------------------------------------------------------------
// Vừa nhập số nguyên, vừa nhập chữ
// nhập chữ-> convert số kiểu dữ liệu tương ứng

        System.out.println("Moi ban nhap so nguyen:");
        int number5 = Integer.parseInt(sc.nextLine()); //Convert từ chữ sang số:Integer.parseInt
        System.out.println("So nguyen ban nhap la:" + number5);


// Nhập số thực
        System.out.println("Moi ban nhap so thuc:");
        float number6 = Float.parseFloat(sc.nextLine());
        System.out.println("So thuc ban nhap la:" + number6);

// Nhập chuỗi
        System.out.println("Moi ban nhap chuoi:");
        String str1 = sc.nextLine();
        System.out.println("Chuoi ban nhap la:" + str1);

// Khai báo mảng
// mảng số nguyên
// <<kiểu sữ liệu>[] <tên biến> = new <kiểu dữ liệu>[<số lượng phần tử>];
// <<kiểu sữ liệu>[] <tên biến> = {ele1,ele2,ele3,...};
        int[] arr = new int[5];
        int[] arr = {1, 2, 3, 4, 5, 6};

        String[] listName = {"Nguyen", "Hanh", "Tran"};
        System.out.println(listName[0]); // Nguyen
        System.out.println(listName[2]); // Tran

// lấy tên cuối cùng của list (Nếu không đếm được)
        int lengthDSTEN = listName.length; // Khai báo biến
        System.out.println(listName[lengthDSTEN - 1]);

// Condition Statement
//  If (<biểu thức điều kiện> ) {
//       logic code nằm trong này
//  }

// Condition đầy đủ IF-ELSE
// If (<biểu thức điều kiện> ) {
//       logic code nằm trong này
//  } Else {
//       logic code nằm trong này
//  }

// Gọi hàm kiemTraDiemThi
        kiemTraDiemThi();


// Tạo hàm riêng để xử lý code liên quan đến kiểm tra điềm thi
// Cú pháp như sau:
// <phạm vi truy cập hàm> static <kiểu dữ liệu> <tên hàm> (<các tham số>) {
//         code trong này
// }

        public static void kiemTraDiemThi () {
            Scanner sc = new Scanner(System.in);
// Bài 1: Kiểu tra điềm thi đại học. Nếu dưới điềm chuẩn thì Fail.
// TH1: neu diem thi>= diem chuan => pass
// TH2: neu diem thi < diem chuan => fail
// TH3: kiem tra kieu du lieu, kiem tra range du lieu,...

            System.out.println("Moi ban nhap diem thi Dai hoc:");
            int diemThi = Integer.parseInt(sc.nextLine());

// TH3: Tạm thời Skip
// kiem tra các dieu kien fail truoc
            if (diemThi < 0 || diemThi > 10) {
                System.out.println("Diem thi khong hop le");
            }

            System.out.println("Moi ban nhap diem chuan:");
            int diemChuan = Integer.parseInt(sc.nextLine());

// kiem tra các dieu kien fail truoc
            if (diemChuan < 0 || diemChuan > 10) {
                System.out.println("Diem chuan khong hop le");
            }

            if (diemThi >= diemChuan) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }

// Bài 2: Tìm số lớn nhất trong 3 số: 4,8,2

    }
}
