package Exception;

public class BankAccount{
    private double balance;

    BankAccount(double amount){

        this.balance=amount;
    }
    public void Withdraw(double amount) throws Insufficent {
        if (amount>balance){
            throw new Insufficent(amount);
        }else {
            System.out.println("Befor : "+balance);
            balance-=amount;
            System.out.println("After : "+balance);
        }
    }
}
