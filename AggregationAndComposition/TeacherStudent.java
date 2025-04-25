package AggregationAndComposition;

import java.util.ArrayList;
import java.util.Locale;

class Student {
    public String name;
    public int rno;

    Student(String name, int rno) {
        this.name = name;
        this.rno = rno;
    }

  public String toString(){
        return name+" having roll no "+rno;
    }
}

class Teacher {
    public String teacherName;
    ArrayList<Student> students;

    Teacher(String teacherName, ArrayList<Student> student) {
        this.teacherName = teacherName;
        this.students = student;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void search(String sname) {
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            String name = students.get(i).name.toLowerCase(); // Get the student's name and convert it to lowercase
            if (name.contains(sname.toLowerCase())) { // Case-insensitive comparison
                System.out.println("Student found: " + students.get(i));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
public class TeacherStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Saif",137);
        Student s2 = new Student("Ali", 110);
        Student s3 = new Student("Ajmal",45);

        ArrayList<Student> studentList = new ArrayList<>();
        Teacher t1 = new Teacher("Naveen",studentList);
        t1.addStudent(s1);
        t1.addStudent(s2);
        t1.addStudent(s3);

        t1.search("sif");
        t1.search("ajmal");}
}

