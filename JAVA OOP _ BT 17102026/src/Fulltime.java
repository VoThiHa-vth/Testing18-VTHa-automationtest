public class Fulltime extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Fulltime(){ super();}
    public Fulltime(String id, String name, double baseSalary, double bonus){
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return super.getBaseSalary() + bonus;
    }




}
