import java.util.Scanner;

// public: thể hiện phạm vi truy cập của đối tượng
// private: thể hiện nội bộ bên trong đối tượng, mà nhưng no khác sẽ không thể truy cập được
// protected: ~~~ (khi cần dùng tới sẽ nói  nha ^^)
public class Student {
// liệt kê các thuộc tính (biến) của đối tượng
    String id;
    String name;
    int age;
    String address;
    String phone;
    String email;
    String gender;

// Hàm khởi tạo đối tượng
// tên hàm trùng với tên đối tượng
// LƯU Ý: nếu không tạo 1 hàm khởi tạo thì bên Java sẽ tự động tạo hàm khởi tạo default => dùng từ khóa new để tạo đối tượng
    public  Student(){
//      trong hàm không có logic code
//      =>> gán giá trị mặc định cho từng thuộc tính

        id = "006";
        age = 20;
        email = "a@gmail.com";
        address = "Viet Nam";
        phone = "023568815";
        name = "Huy";
        gender = "Nam";
// Nếu không gán giá trị mặc định thì nó sẽ lấy giá trị default của biến nhé
        // thử comment code line 23~29 để kiểm tra nhé

    }
// LƯU Ý: Nếu dùng hàm khởi tạo có tham số =>> bắt buộc tạo hàm khởi tạo không tham số

    public Student(String id,
                   String name1,
                   String address,
                   String phone,
                   String email,
                   String gender,
                   int age) {
//     + Nếu trùng tên: để phân biệt tên của thuộc tính và tên của tham số
//      =>> dùng "this" để phân biệt
//     + Nếu khác tên => không cần dùng this
        this.id = id;
        name = name1;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.age = age;


    }


// liệt kê các phương thức (function)
    // hàm nhập giá trị của đối tượng
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap ma hs: ");
        id = sc.nextLine();
        System.out.println("Moi ban nhap ten hs: ");
        name = sc.nextLine();
        System.out.println("Moi ban nhap tuoi hs: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Moi ban nhap dia chi hs: ");
        address = sc.nextLine();
        System.out.println("Moi ban nhap sdt hs: ");
        phone = sc.nextLine();
        System.out.println("Moi ban nhap email hs: ");
        email = sc.nextLine();
        System.out.println("Moi ban nhap gioi tinh hs: ");
        gender = sc.nextLine();

    }

    public  void  display(){
        System.out.println("Mã HS: " + id);
        System.out.println("Tuổi HS: " + age);
        System.out.println("Email HS: " + email);
        System.out.println("Địa chỉ HS: " + address);
        System.out.println("Số ĐT HS: " + phone);
        System.out.println("Tên HS: " + name);
        System.out.println("Giới tính HS: " + gender);
    }








}
