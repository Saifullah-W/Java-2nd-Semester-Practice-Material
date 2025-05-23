package paperPractice;

abstract class Gadget{
    protected String model;
    protected String memory;
    protected int price;
    protected short rating;

    Gadget(String model, String memory, int price, short rating){
        this.model = model;
        this.memory = memory;
        this.price = price;
        this.rating = rating;
    }

    public abstract void initializeSetting();
    public abstract void display();
}

class Smartwatch extends Gadget{
    private short dialSize;
    private String color;
    private boolean caloriesCount;

    Smartwatch(String model, String memory, int price, short rating,short dialSize,String color, boolean caloriesCount){
        super(model, memory, price, rating);
        this.dialSize = dialSize;
        this.color= color;
        this.caloriesCount = caloriesCount;
    }

    public void initializeSetting(){
        System.out.println("Initialize Setting in Smartwatch...");
    }
    public void display(){
        System.out.println(model+" "+memory+" "+price+" "+rating+" "+dialSize+" "+color+" "+caloriesCount);
    }

    public void call(){
        System.out.println("Make call in Smartwatch ...");
    }

    public void checkmsg(){
        System.out.println("Check message in Smartwatch...");
    }
}

class VRHeadSet extends Gadget{
    private String operatingSystem;
    private boolean withControllers;

    VRHeadSet(String model, String memory, int price, short rating,String operatingSystem, boolean withControllers){
        super(model,memory,price,rating);
        this.operatingSystem = operatingSystem;
        this.withControllers = withControllers;
    }

    public void initializeSetting(){
        System.out.println("\n \n Initialize Setting in VRHeadSet...");
    }
    public void display(){
        System.out.println(model+" "+memory+" "+price+" "+rating+" "+operatingSystem+" "+withControllers);
    }
    public void augumentobject(){
        System.out.println("VRHeadSet is augument object...");
    }
}
class Runtime23PastPaper {
    public static void main(String[] args) {
        Gadget g1;
        Smartwatch smartwatch = new Smartwatch("Dt 800","8GB",3000,(short)4,(short) 3,"Black",true);
        g1 = smartwatch;
        g1.initializeSetting();
        g1.display();
//        smartwatch.call();
//        smartwatch.checkmsg();

         VRHeadSet vrHeadSet = new VRHeadSet("dt 800","16GB",500,(short)3.6,"Android ",false);
         Gadget g12;
         g12 = vrHeadSet;
         g12.initializeSetting();
         g12.display();
//         vrHeadSet.augumentobject();
        }

    }


