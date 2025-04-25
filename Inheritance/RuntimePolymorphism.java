package Inheritance;

abstract class Quadrilateral{
    double s1,s2,s3,s4;

    Quadrilateral(double s1, double s2, double s3, double s4){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    public abstract double ComputeArea();{
        System.out.println("Defined method");
    }
}

class Square extends Quadrilateral{
    public Square (double side){
        super(side,side,side,side);
    }

    @Override
    public double ComputeArea() {
        return s1*s1;
    }
}





//      refVar = q1;
//        System.out.println("Area"+refVar.ComputeArea());
//        refVar = s1;
//        System.out.println("Area"+refVar.ComputeArea());
//        refVar = r1;
//        System.out.println("Area"+refVar.ComputeArea());
//    }
//}
//
//

//abstract class Animal{
//    abstract void speak();
//}
//
//class Dog extends Animal{
//    public void speak() {
//        System.out.println("Dog does woof...");
//    }
//        }
//
//class Goat extends Animal{
//    public void speak(){
//        System.out.println("Goat does Maaaayyy...");
//    }
//}
//public class RuntimePolymorphism{
//    public static void main(String[] args) {
//        Animal refvar;
//        Animal animal1= new Dog();
//        Animal animal2 = new Goat();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1 for Dog : \n 2 for Goat : ");
//        int choice = sc.nextInt();
//        if(choice == 1){
//            animal1.speak();
//        } else if(choice == 2) {
//            animal2.speak();
//        }
////        refvar = dog;
////        refvar.speak();
////        refvar = goat;
////        refvar.speak();
//
//
//    }
//}
