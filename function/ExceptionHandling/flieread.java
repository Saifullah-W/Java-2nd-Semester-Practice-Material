package function.ExceptionHandling;

import java.io.FileReader;

class CustomExcLab extends Exception{
    public CustomExcLab(String msg){
        super(msg);
    }
}
public class flieread {
    static void readFile(String filename) throws CustomExcLab{
//        FileReader fr = new FileReader(filename);
        if(filename .equals("Hello")){
            System.out.println("Program says hello");
        }
        else{
            throw new CustomExcLab("program doesn't run");
        }
    }

    public static void main(String[] args) {
        try {
            readFile("hello");
        } catch (CustomExcLab e){
//            System.out.println(e.getMessage());
            System.err.println(e.getMessage());
        }
    }
}
