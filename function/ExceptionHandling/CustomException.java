package function.ExceptionHandling;

public class CustomException {
    public static class InsufficientBalanceException extends Exception{

        InsufficientBalanceException (String msg){
            System.out.println("You have not balanced");
            super(msg);
        }
    }
    public static class BankAccount{
        private double balance;


    BankAccount(double balance){
        this.balance = balance;
    }
    public void withDraw(double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Balance mojood nhi!");
          }
            balance -= amount;
        System.out.println("Withdraw successfull");

    }
    }

    public static void main(String[] args) {
    BankAccount account = new BankAccount(500.0);
    try{
        account.withDraw(600.0);
    } catch (InsufficientBalanceException e){
        System.out.println(e.getMessage());
    }

    try{
        account.withDraw(200.0);
    }catch (InsufficientBalanceException e){
        System.out.println(e.getMessage());
    }
    }
}
