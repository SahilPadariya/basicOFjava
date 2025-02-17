package oopsProgram;

public class account {
    public static void main(String[] args) {
    Account2 a2 = new Account2();
    a2.setaccdetail(100202944901L,"RAHULBHAI",3000,10);
    a2.calculateInterest();
    a2.Accdetail();
    }
}
//class

class Account2 {
    private long accountNumber;
    private String custName;
    private float balance;
    private float interestRate;

    public void setaccdetail(long accountNumber,String custName,float balance, float interestRate){
     this.accountNumber=accountNumber;
     this.custName=custName;
     this.balance=balance;
     this.interestRate=interestRate;
    }
    public void calculateInterest(){
        balance=balance+(balance*interestRate)/100;
    }
    public void Accdetail(){
        System.out.println(custName);
        System.out.println(accountNumber);
        System.out.println(balance);
    }
}
