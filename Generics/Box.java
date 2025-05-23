package Generics;
//
//public class Box<T> {
//    T o;
//    Box(T o ){
//        this.o = o;
//    }
//    T geto(){
//        return o;
//    }
//
//    public static void main(String[] args) {
//        Box<String> box = new Box<>("Saif");

import javax.crypto.spec.IvParameterSpec;

////        box.geto();
//        System.out.println(box.geto());
//    }
//}

//public class Box <S,I> {
//    private S name;
//    private I rollno;
//
//    Box(S name, I rollno){
//        this.name = name;
//        this.rollno = rollno;
//    }
//
//    public S getname(){
//        return name;
//    }
//
//    public I getRollno(){
//        return rollno;
//    }
//
//    public static void main(String[] args) {
//        Box<String, Integer> box = new Box<>("Saif",137);
//        System.out.println(box.getname());
//        System.out.println(box.getRollno());
//    }
//}

public class Box<T,F>{
    public T items;
    public F fruit;

    Box(T items, F fruit){
        this.items=items;
        this.fruit=fruit;
    }

    public void setItems(T items){
        this.items = items;
    }
    public void setFruit(F fruit){
        this.fruit = fruit;
    }
    public T getItems(){
        return items;
    }
    public F getFruit(){
        return fruit;
    }

    public static void main(String[] args) {
        Box<Integer,String> box = new Box<>(23,"Apple");
//        box.setItems(23);
//        box.setFruit("Banana");
//        System.out.println(box.getItems());
//        System.out.println(box.getFruit());
        System.out.println(box.items);
        System.out.println(box.fruit);
    }
}
