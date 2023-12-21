package HomeWork3;

import java.util.TreeSet;

public class HomeWork3 {
    public static void main(String[] args) {


        //Сортировка по убыванию возрастов (от большего к меньшему)
        TreeSet<Employee> employees=new TreeSet<>();
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

        printInfo(employees);

        System.out.println();

        //Сортировка по возрастанию зарплаты
        EmployeeBySalaryComparator comparatorBySalary=new EmployeeBySalaryComparator();
        TreeSet<Employee> employees1=new TreeSet<>(comparatorBySalary);
        employees1.addAll(employees);
        printInfo(employees1);

        System.out.println();
        //Топ-5 сотрудников с наибольшей зарплатой, отсортированных по имени в алфавитном порядке.
//        EmployeeBySalaryTop5Comparator comparatorBySalaryTop5=new EmployeeBySalaryTop5Comparator();
//        TreeSet<Employee> employees3=new TreeSet<>(comparatorBySalaryTop5);
//        employees3.addAll(employees);
//        printInfo(employees3);
//       //o1.getName().compareTo(o2.getName())






    }

    private static void printInfo(TreeSet<Employee> empl)
    {
        for (Employee employee: empl) {
            System.out.println(employee);
        }
    }
}
