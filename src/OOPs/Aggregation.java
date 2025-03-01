package OOPs;

public class Aggregation {
    public static void main(String[] args) {

    }
}
class Adress{
    int Hno;
    String society;
    String city;

    Adress(int Hno,String society,String city){
        this.Hno=Hno;
        this.society=society;
        this.city=city;
    }
}
class MyDetails{
    String name;
    int MobileNo;
    Adress adress;

    MyDetails(String name,int MobileNo,int Hno,String society,String city){
        this.name=name;
        this.MobileNo=MobileNo;
        this.adress=new Adress(Hno,society,city);
    }
}
