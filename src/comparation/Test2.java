package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 8542);
        Employee emp4 = new Employee(1, "Victor", "Delacroix", 0);
//        Arrays.sort(new Employee [] {emp1, emp2, emp3, emp4});
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println("Before sorting \n " + list);
        Collections.sort(list);
        System.out.println("After sorting \n" + list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id +
                ", " + name + '\'' +
                ", " + surname + '\'' +
                ", " + salary + "\n";
    }

    @Override
    public int compareTo(Employee anotherEmp) {
//        if (this.id == anotherEmp.id) {
//            return 0;
//        } else if (this.id < anotherEmp.id) {
//            return -1;
//        } else {
//            return 1;
//        }


//        return this.id - anotherEmp.id;

//        return this.name.compareTo(anotherEmp.name);

        int res = this.name.compareTo(anotherEmp.name);
        if (res==0) {
            res = this.surname.compareTo(anotherEmp.surname);
        }
        return res;
    }
}
