package HomeWork3;

import java.util.TreeSet;

public class HomeWork3 {
    public static void main(String[] args) {


        //Сортировка по убыванию возрастов (от большего к меньшему)
        TreeSet<Employee> employees=new TreeSet<>();
        employees.add(new Employee("Иванов Иван Иванович", 47, 50000));
        employees.add(new Employee("Игнатов Игнат Игнатьевич", 37, 47000));
        employees.add(new Employee("Александров Александр Александрович", 37, 47000));
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
        EmployeeByAscendingSalaryComparator employeeByAscendingSalaryComparator=new EmployeeByAscendingSalaryComparator();
        TreeSet<Employee> employeesSortByIncreasingSalary=new TreeSet<>(employeeByAscendingSalaryComparator);
        employeesSortByIncreasingSalary.addAll(employees);
        printInfo(employeesSortByIncreasingSalary);

        System.out.println();
        //Топ-5 сотрудников с наибольшей зарплатой, отсортированных по имени в алфавитном порядке.
        EmployeeBySalaryDescendingComparator employeeBySalaryDescendingComparator=new EmployeeBySalaryDescendingComparator();
        TreeSet<Employee> employeesSortByDescendingSalary=new TreeSet<>(employeeBySalaryDescendingComparator);
        employeesSortByDescendingSalary.addAll(employees);

        EmployeeByNameComparator employeeByNameComparator=new EmployeeByNameComparator();
        TreeSet<Employee> employeesSortByName=new TreeSet<>(employeeByNameComparator);
        int count=0;
        for (Employee employee:
             employeesSortByDescendingSalary) {
            if (count!=5) {employeesSortByName.add(employee); count++;}
            else break;
        }
        printInfo(employeesSortByName);
        System.out.println();

        //Отсортировать сотрудников по возрастанию возрастов
        //Если возрасты одинаковые - то по убыванию зарплаты
        //Если и они равны - в алвавитном порядке
        EmployeeByAgeSalaryNameComparator employeeByAgeSalaryNameComparator=new EmployeeByAgeSalaryNameComparator();
        TreeSet<Employee> employeeSortByAgeSalaryName=new TreeSet<>(employeeByAgeSalaryNameComparator);
        employeeSortByAgeSalaryName.addAll(employees);
        printInfo(employeeSortByAgeSalaryName);
    }

    private static void printInfo(TreeSet<Employee> empl)
    {
        for (Employee employee: empl) {
            System.out.println(employee);
        }
    }
}
