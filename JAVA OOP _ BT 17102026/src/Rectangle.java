public class Rectangle extends Shape{
    private double dai;
    private double rong;
// CÁch 1: Dùng get-set
//    public double getDai() {
//        return dai;
//    }
//
//    public void setDai(double dai) {
//        if (dai < 0) throw  new IllegalArgumentException("Dai must be positive");
//        this.dai = dai;
//    }
//
//    public double getRong() {
//        return rong;
//    }
//
//    public void setRong(double rong) {
//        if (rong < 0) throw  new IllegalArgumentException("Rong must be positive");
//        this.rong = rong;
//    }
// Cách 2: thêm logic kiểm tra dai, rộng trong hàm khởi tạo
    public Rectangle(double dai, double rong){
        if (dai < 0 || rong < 0)
            throw  new IllegalArgumentException("Dai and Rong must be positive");
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public double area(){
        return dai * rong;
    }

    @Override
    public double perimetter(){
        return (dai + rong) * 2;
    }



}
