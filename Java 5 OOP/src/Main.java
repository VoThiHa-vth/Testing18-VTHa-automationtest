//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// =======================================
// 2 hướng lập trinh : hướng FUNCTION và hướng ĐỐI TƯỢNG OOP
// Đối tượng (Object): là tập hợp các biến để lưu giá trị của đối tượng

// VD: Phim
// - mã phim - String hoặc Int
// - tên phim - String
// - mô tả - String
// - .....

// 1 Object: bao gồm cc thành phần:
// - thuộc tính của đối tượng => tập hợp các biến
// - phương thức của đối tượng => hành động => tức: function
// - hàm khởi tạo => constructor

// Lợi ích khi học OOP:
// - Sẽ hiểu được nghiệp vụ của 1 dự án
// - dễ dàng phát triển và debug lỗi trong lập trình
// - dễ dàng "ẩn các chức năng không cần thiết"

// VỀ SELENIUM:
// POM - page object model pattern
// VD: LOGIN page
// - locator (thẻ HTML trên page ó)
// - loginBtn, usernameInput, passwordInput, logo, label...
// - thuộc tính: các hàm như: clickLoginBtn(); fillUsername(); fillPassword();

// Viết testcase: tạo class để chứa testcase của page đó
// - LoginTest
// từng testcase sẽ tương ứng với từng function của class LoginTest

// class để tương tác với page trên website: Driver, ChromeDriver,...


// TÍNH CHẤT OOP
// Có 4 tính chất
// - tính kế thừa (cha -con)
// - tính đóng gói
// - tính trừu tượng
// - tính đa hình - KHÔNG HỌC NHA

// TÍNH KẾ THỪA: + Class cha sẽ chứa những thuộc tính chung nhất của các đối tượng
//               + Class con sẽ kế thừa các thuộc tính của class cha;

// TÍNH ĐÓNG GÓI
// Bao gồm: private, protected, public
//      1. private: chỉ nội bộ trong class dùng, bên ngoài không thể truy cập kể cả class con;
//      2. public: tất cả class bên ngoài đều có thể ử dụng được
//      3. protected: CHỈ cho class con có thể dùng được, class khác không thể sử dụng
// NGUYÊN TẮC:
//      1. CÁc thuộc tính BẮT BUỘC phải dung private, trừ 1 số case thì dùng protected
//      2. Hàm khởi tạo BẮT BUỘC dùng public
//      3. Trong case các thuộc tih private muốn truy cập tới =>> thì dùng hàm getter, sette


// TÍNH TRỪU TƯỢNG:
// Class cha: BẮT BUỘC CHỈ DÙNG cho class con kế thừa, không được dùng để tạo đối tượng
// Thêm keyword abstract cho class cha


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// tạo đối tượng Student
        Student hs1 = new Student();
//        hs1.id = "123456";
//        hs1.age = 20;
//        hs1.email = "a@gmail.com";
//        hs1.name = "Huy";
//        System.out.println(hs1.id);
//        System.out.println(hs1.age);
//        System.out.println(hs1.email);
//        System.out.println(hs1.name);
// Cách 1: tạo thông tin học sinh
//        hs1.input();
//        hs1.display();
//        System.out.println("===================");
//        Student hs2 = new Student();
//        hs2.input();
//        hs2.display();

// Cách 2: Tạo danh sách học sinh: tạo mảng/list
//        hs1.input();
        System.out.println("===================");
        Student hs2 = new Student();
//        hs2.input();

        Student hs3 = new Student("003", "D", "HCMC","0123456","D","Nam",20);

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(hs1);
        listStudent.add(hs2);
        listStudent.add(hs3);
        for (Student student : listStudent) {               // duyệt theo item student
            student.display();
            System.out.println("===================");
        }


        System.out.println("Example for automation test");
        LoginPage loginPage = new LoginPage();
        loginPage.login("admin","123456");
// TODO: function để kiểm tra result thực tế với result mong đợi
        if (loginPage.isLoginSuccess()){
            System.out.println("Login Success");
        } else {
            System.out.println("Login Fail");
        }



// LƯU Ý:
        //1 . không được dùng class cha vì class cha CHỈ ĐỂ KẾ THỪA thôi
        Car mec = new Car("1","Mercedec","Mer2026","ĐEN",4,"Xăng");
        mec.display();

//        Vehicle vehicle = new.Vehicle(); =>> LỖI vì class Vehicle là class cha (do dùng abstract)






























































    }
}