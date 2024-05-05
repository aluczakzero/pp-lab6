import company.models.Manager;
import company.models.Worker;


public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam", 5000, 1);
        Worker worker2 = new Worker("Dawid", 6000, 2);
        Worker worker3 = new Worker("Jakub", 4500, 3);
        Worker worker4 = new Worker("Artur", 5500, 4);
        Manager manager = new Manager("Adrian", 15000, 5);

        Worker[] workers = {worker1, worker2, worker3, worker4};

        for (Worker worker : workers) {
            System.out.println(worker.getName() + "salary is: " + worker.getSalary());
            worker.work();
        }

        System.out.println((manager.getName() + "salary is: " + manager.getSalary()));
        manager.work();
    }   
}
