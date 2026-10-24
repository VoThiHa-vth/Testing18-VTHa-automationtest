abstract public class Vehicle {
    private String id;
    private String name;
    private String model;
    private String color;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicle () {}

    public Vehicle(String id, String name, String model,String color){
        this.id = id;
        this.name = name;
        this.model = model;
        this.color = color;

    }

    abstract void getInfor();  // Hàm trưu tượng

    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);

    }

}
