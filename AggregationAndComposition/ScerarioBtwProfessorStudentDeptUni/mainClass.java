package AggregationAndComposition.ScerarioBtwProfessorStudentDeptUni;

public class mainClass {
    public static void main(String[] args) {
    University u1 = new University("MUET");
    u1.addDepartment(new Department("SW"));
    u1.addDepartment(new Department("CS"));
    u1.addDepartment(new Department("EL"));

    Student s1 = new Student("Saif");
    Student s2 = new Student("Ali");
    Student s3 = new Student("AMM");

    u1.enrollIn(u1.getDepartment("SW"),s1);
    u1.enrollIn(u1.getDepartment("CS"),s2);
    u1.enrollIn(u1.getDepartment("EL"),s3);

        System.out.println(u1.getDepartment("SW"));

        u1.getDepartment("SW").listStudent();
        System.out.println(s1);
    }
}
