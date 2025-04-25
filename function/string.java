package function;

public class string {
    public static void main(String[] args) {
//        String name = "Saif";
//        String n1 = "saif";
//        String n2 = n1;
//        String n3 = new String("Saif");
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.charAt(3));
//        System.out.println(name.codePointAt(1));
//        System.out.println(name.compareTo(n1));

        String s1 = "I am studying in  muet";
        String key = "muet";
        for(int i=0; i<s1.charAt(i); i++) {
            if (s1.charAt(i) == key.charAt(i)) {
                System.out.println("key found " );
            }
            else{
            System.out.println("key not found");}
        }
    }

}
