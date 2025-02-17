import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int years,months,day;
        int x = scanner.nextInt();
        years=x/365;
        months=(x-(years*365))/30;
        day=(x-years*365-months*30);
        System.out.println("years" + years);
        System.out.println("month" + months);
        System.out.println("day" + day);
    }
}
