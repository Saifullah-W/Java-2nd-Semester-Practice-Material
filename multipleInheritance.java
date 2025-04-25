//interface flying{
//   public void fly();
//}
//
//interface swiming{
//   public void swim();
//}
//
//class Duck implements flying,swiming{
//    public void fly(){
//        System.out.println("Duck is flying ...");
//    }
//
//    public void swim(){
//        System.out.println("Duck is swiming...");
//    }
//}
//public class multipleInheritance {
//    public static void main(String[] args) {
//        Duck duck = new Duck();
//        duck.fly();
//        duck.swim();
//    }
//}

abstract class Flying{
    public abstract void fly();
}

abstract class Swiming{
    public abstract void swim();
}

class Duck extends Flying{
    @Override
    public void fly(){
        System.out.println("Duck is flying");
    }

}
public class multipleInheritance{
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
    }


}