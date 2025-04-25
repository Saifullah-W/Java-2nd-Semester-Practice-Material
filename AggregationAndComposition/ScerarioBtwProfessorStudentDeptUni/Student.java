package AggregationAndComposition.ScerarioBtwProfessorStudentDeptUni;

public class Student {
     String name;
     Department dname;
     University uname;

    Student(String name){
        this.name = name;
    }

//    public void addStudent(Student s){
//        Student.add(s);
//    }

    public String toString(){
        return "Sname "+this.name+"\t"+dname.name+"\t"+uname.uniname;
    }
}
