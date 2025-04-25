package Inheritance;

class Student{
    public int StdId;
    public String name;
    public String className;

    public void display(){
        System.out.println("Student id is : "+StdId);
        System.out.println("Student name is : "+name);
        System.out.println("Class name is "+className);
        System.out.println();
    }

    Student(int StdId, String name, String className){
        this.StdId = StdId;
        this.name = name;
        this.className = className;
    }
}

class UniStudent extends Student{
    public String dept;
    public int pocketMoney;

    public void display(){
        System.out.println("Student id is : "+StdId);
        System.out.println("Student name is : "+name);
        System.out.println("Class name is : "+className);
        System.out.println("Department is : "+dept);
        System.out.println("Pocket money is : "+pocketMoney);
        System.out.println();
    }

    UniStudent(int StdId, String name, String className,String dept,int pocketMoney){
        super(StdId,name,className);
        this.dept = dept;
        this.pocketMoney = pocketMoney;
    }


    public int monthlyPocketMoney(){
        return 30*pocketMoney;
    }

    public int getPocketMoney(){
        return pocketMoney;
    }
}

class temporaryProgram extends UniStudent{
    public String validity;
    public String ProgramName;

    temporaryProgram(int StdId, String name, String className, String dept, int pocketMoney,String validity,String programName) {
        super(StdId, name, className, dept, pocketMoney);
        this.validity = validity;
        this.ProgramName = programName;
    }

    public void display(){
        System.out.println("Student id is : "+StdId);
        System.out.println("Student name is : "+name);
        System.out.println("Class name is "+className);
        System.out.println("Department is : "+dept);
        System.out.println("Pocket money is : "+pocketMoney);
        System.out.println("Validity of course is : "+validity);
        System.out.println("Program name is : "+ProgramName);
    }

}
public class StudentUniStudent {
    public static void main(String[] args) {
        // Inheritance
        Student s1 = new Student(2,"saif","12");
        UniStudent s2 = new UniStudent(25,"ali","24swSec1","software engineering",34);
        temporaryProgram s3 = new temporaryProgram(145,"Ahmed","24swSec2","Software engineering",140,"2 month","NAVTTC");
        s1.display();
        s2.display();
        s3.display();

        // polymorphism, refvar = refrence variable
//        Student refvar;
//        refvar = s1;
//        refvar.display();
//        refvar = s2;
//        refvar.display();
//        refvar = s3;
//        refvar.display();
    }
}
