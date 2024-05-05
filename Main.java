import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


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
        employees.add(new Worker("Alicja", 7000, 6, "2021-06-30", "Product Manager"));
        employees.add(new Worker("Ewa", 7000, 1, "2023-06-30", "Tester"));
        employees.add(new Manager("Szymon", 7000, 5, "2022-06-30", "Team Lead"));

        double totalSalary = 0, totalManagerSalary = 0, totalWorkerSalary = 0;
        Map<Integer, Integer> idCount = new HashMap<>();

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            }
            else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }

            idCount.put(employee.getId(), idCount.getOrDefault(employee.getId(), 0) + 1);
        }

        System.out.println("Total salary for all employees: " + totalSalary);
        System.out.println("Total salary for all managers: " + totalManagerSalary);
        System.out.println("Total salary for all workers: " + totalWorkerSalary);

        System.out.println("Duplicate IDs found:");
        for (Map.Entry<Integer, Integer> entry : idCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("ID " + entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
    }   
}
