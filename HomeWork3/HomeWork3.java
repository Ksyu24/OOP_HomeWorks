package HomeWork3;

import java.util.TreeSet;

public class HomeWork3 {
    public static void main(String[] args) {
        TreeSet<Employee> employees=new TreeSet<Employee>();
        employees.add(new Employee("Иванов Иван Иванович", 47, 50000));
        employees.add(new Employee("Александров Александр Александрович", 37, 47000));
        employees.add(new Employee("Игнатов Игнат Игнатьевич", 37, 47000));
        employees.add(new Employee("Захаров Захар Захарович", 37, 30000));
        employees.add(new Employee("Шапкина Анна Евгеньевна", 27, 150000));
        employees.add(new Employee("Белоус Татьяна Семеновна", 50, 90000));
        employees.add(new Employee("Ардженикидзе Николай Анатольевич", 36, 35000));
        employees.add(new Employee("Федотов Федр Федорович", 18, 20000));
        employees.add(new Employee("Анащук Анна Витальевна", 25, 50000));
        employees.add(new Employee("Яковлев Яков Яковлевич", 39, 63000));

        System.out.println(employees);



    }
}
