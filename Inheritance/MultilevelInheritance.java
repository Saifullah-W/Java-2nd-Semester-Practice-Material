package Inheritance;

class EducationalInstitute{
    String name;
    String location;

EducationalInstitute(String name,String location){
    this.name = name;
    this.location = location;
}

public String toString(){
    return " name is "+name+" having location "+location;
}
}

class University extends EducationalInstitute{
    String uniRank;

    University(String name, String location, String uniRank){
        super(name, location);
        this.uniRank = uniRank;
    }

    public String toString(){
        return "name is "+name+" having location "+location+" University rank is "+uniRank;
    }
}


class Campus extends University{
    String campusName;

    Campus(String name,String location, String uniRank,String campusName){
        super(name,location,uniRank);
        this.campusName = campusName;
    }

    public String toString(){
        return "name is "+name+" having location "+location+" University rank is "+uniRank+" Campus name is "+campusName;
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        EducationalInstitute e1 = new EducationalInstitute("UMT","Lahore");
        University u1 = new University("Sindh university","Jamshoro","12th rank");
        Campus c1 = new Campus("MUET","Jamshoro","5th ","SZAB khairpur");
        System.out.println(e1);
        System.out.println(u1);
        System.out.println(c1);
    }
}
