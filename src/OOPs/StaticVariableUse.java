package OOPs;

public class StaticVariableUse {
    public static void main(String[] args) {

        new Addzerostudent("rahul",30000);
        new Addzerostudent("mayank",40000);
        new Addzerostudent("sahil",20000);
        new Addzerostudent("sujal",35000);
        Addzerostudent.display();
    }

}
class Addzerostudent {
    static int rno;
    String name;
    int Depositfee;
    static int totalfee;
    static String batch;

    static {
        totalfee=64000;
        batch="6:30 PM";
        rno=0;
    }

    Addzerostudent(String name,int Depositfee){
        rno++;
        this.name=name;
        this.Depositfee=Depositfee;
    }
    public static void display(){
        System.out.println("GM");
    }
}
