abstract public class Shape {
//    vì các hình không có cùng thuộc tính nên không tạo thuộc tính chung
// => chỉ cần tạo function tính chu vi và diện tích
    abstract double area();
    abstract double perimetter();
// toString() -> hàm đặc biệt của java
// toString là hàm có sẵn của java nên muốn define lại logic
// =>> cần thêm @Override
// LƯU Ý: Vì không có thuộc tính nên KHÔNG CẦN DEFINE HÀM KHỞI TẠO
//=> Sẽ
    @Override
    public String toString()   {
// hàm perimetter và area sẽ lấy của class con
        return "P: " + perimetter() + "A: " + area();
    }



}
