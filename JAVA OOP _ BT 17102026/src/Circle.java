public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) throw  new IllegalArgumentException("Radius must be positive");
        this.radius = radius;
    }

    Circle(double radius){
//        this.radius = radius;
        setRadius(radius);
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public double perimetter(){
        return 2 * Math.PI * radius;
    }

}
