package HomeWork3;

public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[" + name +
                ", " + age +
                ", " + salary +
                "]";
    }

    @Override
    public int compareTo(Employee o) {
        if(age>o.getAge()){
            return -1;
        }
        else if(age<o.getAge()){
            return 1;
        }
        return 1;
    }
}
