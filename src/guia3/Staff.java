package guia3;

public class Staff extends Person {
    private Double salary;
    private String shift;

    public Staff(String dni, String name, String surname, String email, String address, Double salary, String shift) {
        super(dni, name, surname, email, address);
        this.salary = salary;
        this.shift = shift;
    }

    public Staff() {
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salary=" + salary +
                ", shift='" + shift + '\'' +
                '}';
    }

    public double anualSalary() {
        return salary * 12d;
    }
}
