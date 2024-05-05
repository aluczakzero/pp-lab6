import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam", 5000, 1, "2020-01-10", "Developer");
        Worker worker2 = new Worker("Dawid", 6000, 2, "2020-02-15", "Designer");
        Worker worker3 = new Worker("Jakub", 4500, 3, "2019-05-20", "Tester");
        Worker worker4 = new Worker("Artur", 5500, 4, "2018-03-30", "Developer");
        Manager manager = new Manager("Adrian", 15000, 5, "2017-04-10", "Team Lead");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + "has code: " + employee.hashCode());
        }

        System.out.println("Comparing " + worker2.getName() + " with others:");
        for (Employee employee : employees) {
            if (worker2.equals(employee)) {
                System.out.println(worker2.getName() + " equals " + employee.getName());
            }
            else {
                System.out.println(worker2.getName() + " does not equal " + employee.getName());
            }
        }
    }   
}
