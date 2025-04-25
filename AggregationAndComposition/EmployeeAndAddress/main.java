package AggregationAndComposition.EmployeeAndAddress;

public class main {
    public static void main(String[] args) {
        Address a = new Address("Sindh","Pakistan");
        Employee e1 = new Employee("Saif",137,"147 Royal city Sanghar",a);
        Employee e2 = new Employee("Ali",156,"786 tehruv",a);
        System.out.println(e1);
        System.out.println(e2);
    }
}
