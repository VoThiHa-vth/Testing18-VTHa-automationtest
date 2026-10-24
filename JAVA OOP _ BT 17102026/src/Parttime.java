public class Parttime extends Employee {
    private int hours;
    private double rate;

    public double getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Parttime (){ super();}
    public Parttime(String id, String name, int hours, double rate) {
        super(id, name, 0);  // Parttime thì không có baseSalary nên không cần define cũng ợc nhé
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculateSalary(){
        return hours * rate;
    }
}
