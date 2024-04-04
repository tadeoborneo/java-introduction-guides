package guiaUno;

public class Employee   {
    private String dni;
    private String name;
    private String surname;
    private Float salary;

    public Employee(String dni, String name, String surname, Float salary) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void incrementSalary(Float percent){
        Float increment = this.salary * (percent/100);
        this.salary += increment;
    }
}
