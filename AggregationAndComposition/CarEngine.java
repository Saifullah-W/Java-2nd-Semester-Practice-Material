package AggregationAndComposition;

class Engine{
    String model;

    Engine(String model){
        this.model = model;
    }
    public void Start(){
        System.out.println("engine "+model+" is started");
    }
}

class Car{
    String brand;
    Engine engine;

    Car(String brand, String engine1){
        this.brand = brand;
        this.engine = new Engine(engine1);
    }

    public void StartCar(){
        System.out.println("Starting car "+brand);
        engine.Start();
    }
}
public class CarEngine {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota","v3");
        c1.StartCar();
    }
}
