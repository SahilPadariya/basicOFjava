package OOPs;

public class PolymorPhism {
    public static void main(String[] args) {

        //OVERRIDING

        Bank b;
        b = new Bank();
        b.PrintInterest();
        b = new SBI();
        b.PrintInterest();
        b = new KOTAK();
        b.PrintInterest();

        //OVERLOADING
        PolymorPhism p1=new PolymorPhism();
        p1.show(10,"s");
        p1.show("mayank",20);
    }
    public static void show(int a,String b) {
        System.out.println("int method");
    }
    public static void show(String a,int b) {
        System.out.println("String method");
    }

}
class Bank{
  int AccountNo;
  double Balance;
    public void PrintInterest(){
        System.out.println(4);
    }
}
class SBI extends Bank{
    @Override
    public void PrintInterest(){
        System.out.println(5);
    }
}
class KOTAK extends Bank{
    @Override
    public void PrintInterest(){
        System.out.println(6);
    }
}

