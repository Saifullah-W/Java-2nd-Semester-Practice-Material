package AggregationAndComposition;

class Address{
    private String Street;
    private String City;
    private String Country;

    Address(){

    }

    Address(String Street, String City, String Country){
        this.Street = Street;
        this.City = City;
        this.Country = Country;
    }

    public void setStreet(String street){
        this.Street = street;
    }

    public String getStreet() {
        return Street;
    }

    public String toString(){
        return Street+", "+City+", "+Country;
    }
}

class Employee{
    private int id;
    private String name;
    private Address add;

    Employee(){

    }
    Employee(int id, String name, Address add) {
        this.id = id;
        this.name = name;
        this.add = add;
    }

    public void DisplayAdd(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Address : "+add);
    }
}
public class practice {
    public static void main(String[] args) {
        Address a1 = new Address("HN 147","Royal city Sanghar","Pakistan");
        Employee e1 = new Employee(13,"Saifullah",a1);
        e1.DisplayAdd();
        Address a2 = new Address("Mohala 34","Mumbai","India");
        Employee e2 = new Employee(259,"Rohit",a2);
        e2.DisplayAdd();
    }
}
