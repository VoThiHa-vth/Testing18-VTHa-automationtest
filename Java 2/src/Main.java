import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
// ôn lại mô hình 3 khối
// bài 1: Tính chu vi và diện tích hình chữ nhật
    public static void chuViDienTich(float dai, float rong) {
//        fail first
//        TH1: dai, rong > 0
            if (dai < 0 || rong < 0) {
                System.out.println("Chieu dai, chieu rong khong duoc am");
                return;
            }
            float chuVi = 2 * (dai + rong);
            float dienTich = dai * rong;
//      output: in ra chu vi, dien tich
            System.out.println("Chu vi:" + chuVi);
            System.out.println("Dien tich:" + dienTich);
        }

    public static void soLonNhat(int num1, int num2, int num3) {
        int maximun = num1;
        if (num2 > maximun) {
          maximun = num2;
        }
        if (num3 > maximun) {
            maximun = num3;
        }
        System.out.println("So lon nhat là: " + maximun);
        }

    public static void kiemTraHocLuc(float diemTB){
        if (diemTB < 0 || diemTB > 10) {
            System.out.println("Diem TB khong hop le");
            return;
        }
        if (9 <= diemTB && diemTB <= 10) {
            System.out.println("Xuat sac");
        } else if (8 <= diemTB && diemTB < 9){
            System.out.println("Gioi");
        } else if (6.5 <= diemTB && diemTB < 8){
            System.out.println("Kha");
        } else if (5 <= diemTB && diemTB < 6.5){
            System.out.println("Trung binh");
        } else {
            System.out.println("Yeu");
        }
    }

    public static void tinhTienDien(float soKWh){
        if (soKWh < 0){
            System.out.println("So kWh khong hop le");
            return;
        }
        int tienDien = 0;
        double roundSoKWh = Math.ceil(soKWh); // lam tron len
        if (roundSoKWh <= 50) {
            tienDien = (int) (1800 * roundSoKWh);
        } else if (51 <= roundSoKWh && roundSoKWh <= 100) {
            tienDien = 1800 * 50 + (int) (2000 * (roundSoKWh - 50));
        } else if (101 <= roundSoKWh && roundSoKWh <= 200) {
            tienDien = (1800 * 50) + (2000 * 50) + (int) (2500 * (roundSoKWh - 100));
        } else {
            tienDien =  (1800 * 50) + (2000 * 50) + (2500 * 100)+ (int) (3000 * (roundSoKWh - 200));
        }
        System.out.println("Tien dien:" + tienDien);
    }

// Bài tập loop
// Bài 1: In các số từ 1->100
    public static void inSoTu1Den100 () {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
// Bài 2L in số chẵn từ 0 -> 100
    public static void inSoChanTu0Den100 () {
        for (int i = 0; i <= 100; i +=2) {
            System.out.println(i);
        }
    }

//Bài 3: tính tổng các số từ 1->300
    public static void Sum1To300 () {
        int sum = 0;
        for (int i = 1; i <= 300; i++) {
            sum +=1;
        }
        System.out.println("Tong so tu 1 den 300 la: " + sum);
    }

// Bài 4: In bảng cửu chương 5
    public static void cuuChuong5() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x" + i + "=" + (5 * i));
        }
    }
// Bài 5: Tính giai thừa của n
// n! = n * (n-1) * (n-2) *....* 2 * 1
// đk bắt đầu vòng lặp i =1
// điều kiện dừng: i <=n
// bước nhảy: i++
    public static void giaiThua (int n) {
        if (n <= 1) {
            System.out.println("n khong hop le");
            return;
        }
        int result = 1;
        for (int i = 2; i <= n; i++){
            result *= i;
        }
        System.out.println("Giai thua cua n la: " + result);
    }

// Bài 6: in ra n số fibonaci
// n = 5 => in ra 5 số đầu tiên của dãy fibonaci
// fibonaci: số tiếp theo là bằng tổng của 2 số liền kề trước nó
// 0 1 1 2 3 5 8...
// đk bắt đầu vong lắp : i = 1
// đk dừng: i <= n
// bước nhảy: i++
    public static void fibonaci (int n) {
      int prev1 = 0;
      int prev2 = 1;
      for (int i = 1; i <= n; i++) {
          System.out.println(prev1 + " ");
          int next = prev1 + prev2;
          prev1 = prev2;
          prev2 = next;
      }
    }
// i = 1
// 0
// prev1 = 1, prev2 = 1
// i = 2
// 0 1
// prev1 = 1, prev2 = 2
// i = 3
// 0 1 1
// prev1 = 2, prev2 = 3
// i = n ....




    public static void main(String[] args) {
// bài 1: tính chu vi, dien tich hinh chu nhat
            Scanner sc = new Scanner(System.in);
            System.out.println("bài 1: tính chu vi, dien tich hinh chu nhat");
            System.out.println("Nhap chieu dai: ");
// phai parse tu string -> number vi sau nay se nhap ca chu và so
    float dai = Float.parseFloat(sc.nextLine());

    System.out.println("Nhap chieu rong: ");
    float rong = Float.parseFloat(sc.nextLine());
//  goi ham chuViDienTich
    chuViDienTich(dai, rong);


// Bài 2: tìm số lớn nhất trong 3 số
// input: 3 tham số nguyên
// output: số lớn nhất
//      define hàm
//      - int num1, int num2, int num3
//      - int maximun
// process: thuật toán flag
// -> Tức là: là chọn 1 số bất kỳ làm s lớn nhất. Thường sẽ chọn số đầu tiên là số "lớn nhất"
// --duyệt từ số thứ 2 trở đi
// + Nếu số đang xét >  số "lớn nhất"' -> gán số "lớn nhất" = số đang xét
// + ngược lại => next

    int num1 = 4;
    int num2 = 2;
    int num3 = 7;
    soLonNhat(num1, num2, num3);

// Bai 3: kiem tra hoc luc cua hoc sinh dua vao diem trung bình
// input: diem trung binh
// output: hoc luc
// process:

    System.out.println("Bai 3: Kiem tra hoc luc cua hoc sinh");
    float diemTB = 9.75f;
    kiemTraHocLuc(diemTB);

// Bai 4: Tinh tien dien
//  Bậc 1: 1-50kWh -> 1800
//  Bậc 2: 51-100kWh -> 2000
//  Bậc 1: 101-200kWh -> 2500
//  Bậc 1: >201kWh -> 3000
//  1 số bài tập tương đương: tính tiền thuế, tính tiền taxi...

        System.out.println("Bai 4: Tinh tien dien");
        float soKWh = 50.5f;
        tinhTienDien(soKWh);

// bài tập Loop
// Bài 1: In các số từ 1->100



    }
}

// Loop statement
// 1 list user => 1 list testcase cho từng user

// nguyên lý lập trình
// TRÁNH

// Kiểu 1: Dùng vòng For
// Kiểu 2: Dùng While
// Kiểu 3: Dùng Do...while

// Nguyên tác:
// - XÁc định điều kiện dừng
// - xác định bước nhảy

// for (<bắt đầu vòng lặp>;<điều kiện dừng>;<bước nhảy>) {
//      code ở đây
// }

// Bài 1: In các số từ 1->100
// Điều kiện 1: bắt đầu vòng lặp khi nào
// có biến chạy i(iterator) , cho i = 1;

// Điều kiện 2: điều kiện dừng
// cho i chjay tới 100 thì dừng lại
// i <= 100;

// Điều kiện 3: bước nhảy
// i = i +1 => i++ (bước nhảy là 1)

// for (int i =1; i <=100; i++) {
//     System.out.println(i);
//  }

