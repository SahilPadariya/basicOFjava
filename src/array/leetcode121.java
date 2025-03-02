package array;

public class leetcode121 {
    public static void main(String[] args) {
        int price[]={7,6,4,3,1};
        int buy=price[0];
        int profit=0;
        for (int i=1; i<price.length;i++){
            if (buy>price[i]){
                buy=price[i];
            } else if (profit<price[i]-buy) {
                profit=price[i]-buy;
            }
        }
        System.out.println(profit);
    }
}
