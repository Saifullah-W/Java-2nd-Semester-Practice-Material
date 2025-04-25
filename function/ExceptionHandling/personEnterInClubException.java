package function.ExceptionHandling;

public class personEnterInClubException {

    public static class EnterYourSelf extends Exception {
        EnterYourSelf(String msg) {
            System.out.println("Throw custom exception");
            super(msg);
        }
    }
        public static class Register{
            String name ;

            Register(String name){
                this.name = name;
            }

            public void entername(String n)throws EnterYourSelf{
                if(n!=name){
                    throw new EnterYourSelf("Plz register your self");
                }
                System.out.println("you are already registered! you can go to club ");
            }
        }


    public static void main(String[] args) {
        Register r1 = new Register("Saif");
        try{
            r1.entername("Ali");
        } catch (EnterYourSelf e){
            System.out.println(e.getMessage());
        }

        try{
            r1.entername("Saif");
        } catch (EnterYourSelf e){
            System.out.println(e.getMessage());
        }
    }
}
