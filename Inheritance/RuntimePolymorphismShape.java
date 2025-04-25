package Inheritance;

abstract class Shape{
    float f1,f2;
    Shape(float f1 , float f2){
        this.f1 = f1;
        this.f2 = f2;
    }
    abstract double area();
}

class Circle extends Shape {
    public Circle(float r,float r1) {
        super(r,r1);
    }

    public double area() {
        return 3.14 * f1 * f1;
    }
}
class Rectangle extends Shape{
    public Rectangle(float l, float w){
            super(l,w);
        }
    public double area(){
            return f1*f2;
        }
}

public class RuntimePolymorphismShape {
    public static void main(String[] args) {
        Shape c1 = new Circle(2, 4);
        Shape r1 = new Rectangle(2, 4);
        System.out.println(c1.area());
        System.out.println(r1.area());
    }
}
