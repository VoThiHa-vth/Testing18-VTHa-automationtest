//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// VD1: Quản lý nhân viên
// Nhân viên fulltime, parttime: id, name, lương cơ bản
// Nhân viên fulltime: bonus
// Nhân viên parttime: hours, rate
// Phân tích:
// Class Employee - class cha
// Class Fulltime - class con
// Class Parttime - class con
        // Tính đa hình
        Employee[] listEmployee = {
                new Fulltime("F01", "An",10_000_000,5_000_000),
                new Parttime("P01","Bình",10,500_000)
        };
        for (Employee e : listEmployee) {
            System.out.println(e.getName() + " - " + e.calculateSalary());
        }

// VD2: Hình Học
// Tính chu vi và diện tích của hình tròn(Circle), hình chữ nhật (Rectangle)
// Shape - class cha
// Circle - class con
// Rectangle - class con

        System.out.println("====================");
        Shape[] listShape= {
                new Circle(10),
                new Rectangle(10,20)
        };
        for (Shape s : listShape) {
//      java auto gọi hàm toString() để in ra area và perimetter
            System.out.println(s);
        }






















    }
}