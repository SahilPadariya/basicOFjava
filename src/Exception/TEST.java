package Exception;

public class TEST {
    public static void main(String[] args) {
        try {
            BankAccount bankAccount=new BankAccount(100);
            bankAccount.Withdraw(10);
        } catch (Insufficent e) {
            System.out.println(e.getAmount());
            System.out.println(e);
        }
    }
}

