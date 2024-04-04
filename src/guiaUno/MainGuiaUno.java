package guiaUno;


public class MainGuiaUno {
    public static void main(String[] args) {
        /*
        //region EJ 1
        Rectangle r1 = new Rectangle();
        System.out.println("width: "+r1.getWidth()+" height: "+r1.getHeight());
        System.out.println("area: "+r1.rectangleArea()+" perimeter: "+r1.rectanglePerimeter());
        r1.setHeight(10f);
        r1.setWidth(2f);
        System.out.println("area: "+r1.rectangleArea()+" perimeter: "+r1.rectanglePerimeter());
        //endregion

        //region EJ 2
        Employee e1 = new Employee("23456345","Carlos","Gutierrez",25000f);
        Employee e2 = new Employee("34234123","Ana","Sanchez",27500f);
        System.out.println(e2.toString());
        System.out.println(e1.toString());
        e1.incrementSalary(15f);
        System.out.println(e1.getSalary());
        //endregion

        //region EJ 3
        SaleItem itemOne = new SaleItem("1321","Phone",10,2000f);
        itemOne.setTotalPrice(itemOne.totalPrice());
        System.out.println(itemOne.toString());
        //endregion

        //region EJ 4
        BankAccount account1 = new BankAccount("12221","Tadeo",15000f);
        account1.credit(2500f);
        account1.debit(1500f);
        account1.debit(0000f);
        System.out.println(account1.toString());
        //endregion
         */
        //region EJ 5
        Time t1 = new Time(checkHour(23), checkMinute(59),checkSecond(59));
        System.out.println(t1.toString());
        System.out.println(t1.addSecond());
        System.out.println(t1.subtractSecond());
        //endregion

    }

    public static Integer checkHour(Integer hour){
        if (hour < 0 || hour > 23)
            throw new IllegalArgumentException("Hora fuera de rango. Debe ser entre 0 y 23.");
        return hour;
    }
    public static Integer checkMinute(Integer minute){
        if (minute < 0 || minute > 59)
            throw new IllegalArgumentException("Minutos fuera de rango. Deben ser entre 0 y 59.");
        return minute;
    }
    public static Integer checkSecond(Integer second){
        if (second < 0 || second > 59)
            throw new IllegalArgumentException("Segundos fuera de rango. Deben ser entre 0 y 59.");
        return second;
    }
}
