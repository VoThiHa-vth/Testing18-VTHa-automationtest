abstract public class Employee {
    private String id;
    private String name;
    private double baseSalary;

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

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Employee(){}
    public Employee(String id, String name, double baseSalary){
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }
// Do tính lương của mỗi class khác nhay nên define hàm tính lương
// thuộc dạng abstact ->> Class cha cũng abstract nhé
    abstract public double calculateSalary();




}
