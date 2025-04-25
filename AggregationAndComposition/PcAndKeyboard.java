package AggregationAndComposition;

class Keyboard{
public String languageType;    

Keyboard(String languageType){
    this.languageType = languageType;
}

public void displaylanguage(){
    System.out.println("Keyboard language is "+languageType);
}
}

class PC{
    public String microp;
    public int ram;
    public int memory;
    public Keyboard keyboard;
    
    PC(String microp, int ram, int memory, Keyboard keyboard){
        this.microp = microp;
        this.ram = ram;
        this.memory = memory;
        this.keyboard = keyboard;
    }



    public void addKeyboard(Keyboard keyboard){
        this.keyboard = keyboard;
        System.out.println("Keyboard is add ");
    }
    
    public void removeKeyboard(){
        this.keyboard = null;
        System.out.println("Keyboard is removed");
    }

    public String toString(){
        return microp+" processor, "+ram+" GB "+memory+" GB , keyboard language "+(keyboard !=null? keyboard.languageType : "no keyboard");
    }
}
public class PcAndKeyboard {
    public static void main(String[] args) {
        Keyboard k1 = new Keyboard("english");
        Keyboard k2 = new Keyboard("urdu");
        PC p1 = new PC("intel",8,128,k1);
        PC p2 = new PC("fgg",16,256,k2);
        p1.addKeyboard(k1);
        p2.addKeyboard(k2);
        System.out.println(p1);
        System.out.println(p2);
        p1.removeKeyboard();
        p1.removeKeyboard();
        p1.addKeyboard(k2);
        p2.addKeyboard(k1);
        System.out.println(p1);
        System.out.println(p2);

    }
}
