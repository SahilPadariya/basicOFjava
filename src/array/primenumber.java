package array;

public class primenumber {
    public static void main(String[] args) {
        int a=9,count=0;
        for(int i=2;i<a;i++){
          if(a%i==0){
              System.out.println("not prime");
              return;
            }
          }
        System.out.println("prime");
    }

}
