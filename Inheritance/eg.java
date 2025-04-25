package Inheritance;

class parent{
    int income;
    parent(int income){
        this.income = income;
    }
}
class child1 extends parent{
    String name;
    child1(String name,int income){
        this.name = name;
        super(income);
    }

    public void display(){
        System.out.println(name +"has "+income);
    }
}
class child2 extends parent{
    String name;
    child2(String name,int income){
        this.name = name;
        super(income);
    }
    public void display(){
        System.out.println(name +"has "+income);
    }
}
public class eg {
    public static void main(String[] args) {
        parent p1 = new parent(340);
//        child1 c1 = new child1("Saif ", 300);
//        child2 c2 = new child2("Ali ",500);
//        c1.display();
//        c2.display();

//        parent p2 = new child1("saif",1200);
//        System.out.println(p1.income);
//        System.out.println(p2.income);

    
    }
}
