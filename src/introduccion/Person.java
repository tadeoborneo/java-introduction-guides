package introduccion;

import java.util.SplittableRandom;

public class Person {
    private Integer dni;
    private String name;

    public Person() {

    }

    public Person(Integer dni, String name) {
        this.dni = dni;
        this.name = name;
    }


    public Integer getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
    public void setName(String name) {
        this.name = name;
    }
}
