package AggregationAndComposition.EmployeeAndAddress;

public class Employee {
    String name;
    int id;
    String hno;
    Address adds;

    Employee(String name,int id,String hno,Address adds){
        this.name = name;
        this.id = id;
        this.hno = hno;
        this.adds = adds;
    }

    public String toString(){
        return " "+name+" "+id+" "+hno+" "+adds.province+" "+adds.country;
    }
}
