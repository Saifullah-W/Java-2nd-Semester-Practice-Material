package AggregationAndComposition.ScerarioBtwProfessorStudentDeptUni;

import java.util.ArrayList;

public class  University {
     String uniname;
     ArrayList<Professor> profs = new ArrayList<Professor>();
     ArrayList<Department> depts = new ArrayList<Department>();

    University(String uniname){
        this.uniname = uniname;
    }

   public void addDepartment(Department d){
        depts.add(d);
        d.uname = this;
   }

   public void addProfessor(Professor p){
        profs.add(p);
        p.uname = this;
   }

   Department getDepartment(String name){
        for(int i=0; i<depts.size(); i++){
            if(depts.get(i).name.equals(name))
                return depts.get(i);
        }
        return null;
   }

//    Department getProfessor(String name){
//        for(int i=0; i<profs.size(); i++){
//            if(profs.get(i).name.equals(name))
//                return profs.get(i);
//        }
//        return null;
//    }

    public void enrollIn(Department d, Student s){
        s.dname = d;
        s.uname = this;
        d.studentList.add(s);
    }




    public String toString(){
        return "University : "+uniname;
    }
}
