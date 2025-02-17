package array;

public class palindrome {
    public static void main(String[] args) {
        int a=1784,rem=0,rev=0,count=0;
          for (int i=a;i>0;i=i/10){
              count++;
              rem=i%10;
              rev=(rev*10)+rem;
              if (rev==a){
                  System.out.println("this number is palindrome");
                  return;
              }
          }
        System.out.println("not palindrome");
    }
}
