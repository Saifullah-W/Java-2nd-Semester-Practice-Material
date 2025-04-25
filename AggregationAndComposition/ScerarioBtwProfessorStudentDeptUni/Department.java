package AggregationAndComposition.ScerarioBtwProfessorStudentDeptUni;

import java.util.ArrayList;

public class Department {
     String name;
     University uname;
     ArrayList<Student> studentList = new ArrayList<Student>();

    Department(String name){
        this.name = name;
    }
    public void listStudent(){
        for(int i=0; i<studentList.size(); i++){
            System.out.println(studentList.get(i).name);
        }
    }

    public String toString(){
        return name+" is belonging to :"+uname;
    }

}
