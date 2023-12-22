package HomeWork3;

import java.util.Comparator;

public class EmployeeByAgeSalaryNameComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        //return o2.getAge()- o1.getAge();
        if(o1.getAge()<o2.getAge()){
            return -1;
        }
        else if(o1.getAge()>o2.getAge()){
            return 1;
        }
        else {
            if(o1.getSalary()<o2.getSalary()){
                return 1;
            }
            else if(o1.getSalary()>o2.getSalary()){
                return -1;
            }
            else {
                return o1.getName().compareTo(o2.getName());
            }
        }
    }
}
