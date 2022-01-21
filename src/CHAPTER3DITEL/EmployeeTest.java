package CHAPTER3DITEL;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Blessing", "Grace",50000.00);
        Employee worker2 = new Employee("Destiny", "Profit", 35000.00);

        System.out.printf("Name is: %s %s%n pay: is %.2f%n  ", worker1.getFirstName(), worker1.getLastName(), worker1.getSalary());
        System.out.printf("Name is: %s %s%n pay is: %.2f    ", worker2.getFirstName(), worker2.getLastName(), worker2.getSalary());

        worker1.getSalary();
        worker1.increaseSalary();
        System.out.println();
        System.out.println("new salary is " + worker1.getSalary());

        worker2.getSalary();
        worker2.increaseSalary();
        System.out.println();
        System.out.println("new salary is " + worker2.getSalary());


    }

}
