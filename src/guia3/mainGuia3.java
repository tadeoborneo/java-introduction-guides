package guia3;

import java.util.ArrayList;
import java.util.List;

public class mainGuia3 {
    public static void main(String[] args) {

        /*
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2d);
        cylinder.setHeight(3d);
        System.out.println("radius: "+cylinder.getRadius()+", height: "+ cylinder.getHeight()+", base area: "+cylinder.area()+", cylinder volume:"+cylinder.cylinderVolume());
        System.out.println(cylinder);


        Student student1 = new Student("46112406","Tadeo", "Borneo", "tadeoborneo@outlook.com", "Talcahuano 493", 2023, 38000d, "TUP");
        Student student2 = new Student("46112407","Mateo", "Calafiore", "mateocalafiore@outlook.com", "Salta 4121", 2023, 38000d, "Ingenieria naval");
        Student student3 = new Student("46112408","Juan", "Merna", "juanmerna@outlook.com", "Colon 4180", 2020, 38000d, "Ingles");
        Student student4 = new Student("46112409","Luis", "Lastra", "luislastra@outlook.com", "Laprida 2341", 2024, 58000d, "Licenciatura en sistemas");

        Staff staff1 = new Staff("30283443", "Marcos", "Master", "marcosmaster@gmail.com", "Acevedo 1500", 550000d, "Night");
        Staff staff2 = new Staff("30283444", "Hector", "Juanfer", "hectorjuanfer@gmail.com", "Jara 1332", 330000d, "Morning");
        Staff staff3 = new Staff("30283445", "Juana", "Lisan", "juanalisan@gmail.com", "Marconi 2939", 630000d, "Morning");
        Staff staff4 = new Staff("30283446", "Martina", "Nivea", "martinanivea@gmail.com", "Belgrano 887", 700000d, "Night");

        List<Person> people = new ArrayList<>();

        people.add(student1);
        people.add(student2);
        people.add(staff1);
        people.add(staff2);
        people.add(staff3);
        people.add(student3);
        people.add(student4);
        people.add(staff4);

        Integer staffCount = 0;
        Integer studentsCount = 0;
        Double instituteEarns = 0d;

        for (Person a : people) {
            if (a instanceof Student) {
                studentsCount++;
                instituteEarns += ((Student) a).getMonthlyQuote();
            }
            else if (a instanceof Staff)
                staffCount++;
        }

        System.out.println("students: "+studentsCount+" staff: "+staffCount);
        System.out.println(instituteEarns);

         */
        Rectangle r1 = new Rectangle();
        r1.setHeight(10d);
        r1.setWidth(5d);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
