package OOPs;

public class Quetion5 {
    public static void main(String[] args) {
        Holiday [] list={
                new Holiday("KITE FESTIVAL",14,"JANUARY"),
                new Holiday("REPUBLIC DAY",26,"JANUARY"),
                new Holiday("Christmas", 25, "December"),
                new Holiday("Black Friday", 28, "November"),
                new Holiday("New Year", 1, "January"),
                new Holiday("Ambedkar Jayanti", 14, "April"),
                new Holiday("World Environment Day", 5, "June"),
                new Holiday("Teachers’ Day", 5, "September"),
                new Holiday("Engineers' Day", 15, "September"),
        };
        System.out.println (list[0].inSameMonth(list[2]));
        System.out.println(list[0].avgDate(list));
    }
}
class Holiday{
    private String name;
    private int day;
    private String month;

    Holiday(String name,int day,String month) {
    this.name=name;
    this.day=day;
    this.month=month;
    }
    public boolean  inSameMonth(Holiday other){
        return this.month.equals(other.month);
    }
    public double avgDate(Holiday[] avg){
        double sumday=0;
        for (int i=0;i<avg.length;i++){
            sumday=sumday+avg[i].getdate();
        }
        return sumday/avg.length;
    }
    public int getdate(){
        return day;
    }
}
