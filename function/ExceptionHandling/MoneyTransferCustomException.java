package function.ExceptionHandling;

class TransferException extends Exception{
    public TransferException(String msg){
        super(msg);
    }
}

class bankAccount{
    private int balance = 0;
    public String stakeHolder;
    bankAccount(String stakeHolder, int balance){
        this.stakeHolder = stakeHolder;
        this.balance = balance;
    }

    public void TransferMoney(bankAccount reciver, int value) throws TransferException{
        if(balance > value){
            this.balance -= value;
            reciver.sendMoney(value);
        } else {
            throw new TransferException("Insufficient Balance ! , Gareeb ");
        }
    }

    public void sendMoney(int value){
        balance += value;
    }

    public void displayMoney(){
        System.out.println(stakeHolder+" have balance : "+balance);
    }

    public void bulkTransfer(int value){

    }
}

public class MoneyTransferCustomException {
    public static void main(String[] args) {

        bankAccount saif = new bankAccount("Saif",1000);
        bankAccount ali = new bankAccount("Ali",500);
        bankAccount saqib = new bankAccount("Saqib",500);
        bankAccount awais = new bankAccount("Awais",500);
        bankAccount hr = new bankAccount("HR",500);
        System.out.println("Before transfer");
        saif.displayMoney();
        ali.displayMoney();
//        try {
//            saif.TransferMoney(ali,400);
//        } catch (TransferException e){
//            System.out.println(e.getMessage());
//        }

        try {
            ali.TransferMoney(saif,300);
        } catch (TransferException e){
            System.out.println(e.getMessage());
        }



        bankAccount[] account = new bankAccount[5];
        for(int i=0; i< account.length; i++){
            try {
                saif.TransferMoney(ali,100);
                saif.TransferMoney(saqib,100);
                saif.TransferMoney(awais,100);
                saif.TransferMoney(hr,100);
            } catch (TransferException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("After Transfer");
        saif.displayMoney();
        ali.displayMoney();
    }
}
