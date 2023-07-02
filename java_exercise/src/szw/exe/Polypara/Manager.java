package szw.exe.Polypara;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println(getName() + " now is managing");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + this.bonus;
    }
}
