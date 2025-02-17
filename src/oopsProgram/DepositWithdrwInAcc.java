package oopsProgram;

public class DepositWithdrwInAcc {
    public static void main(String[] args) {
        acc a1=new acc();
        a1.setaccdetail(100202944,"RAHULBHAI",8000);
        a1.withdraw(8000);
        a1.deposit(9000);
        a1.displaydetail();
    }
}
class acc{
    private long accountNum;
    private String custname;
    private float balance;

    public void setaccdetail(long accountNum,String custname,float balance){
    this.accountNum=accountNum;
    this.custname=custname;
    this.balance=balance;
    }
    public void deposit(int deposit){
       balance=balance+deposit;
    }
    public void withdraw(int withdraw){
        if (balance<withdraw){
            System.out.println("out off balance");
            return;
        }
        else {
            balance=balance-withdraw;
        }
    }
    public void displaydetail(){
        System.out.println(accountNum);
        System.out.println(custname);
        System.out.println(balance);
    }
}
