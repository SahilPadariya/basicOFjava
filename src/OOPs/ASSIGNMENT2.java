package OOPs;

import java.util.Arrays;
import java.util.Scanner;

public class ASSIGNMENT2 {
    public static void main(String[] args) {
    Student s1=new Student();
    Student s2=new Student();
    Student s3=new Student();
    s1.input();
    s1.show();
    System.out.println(s1.Totalmark());
    s1.getHighest();
    s1.getLowest();
    s1.getAvg();
    s1.getPassCount();

    s2.input();
    s2.show();
    System.out.println(s1.Totalmark());
    s2.getHighest();
    s2.getLowest();
    s2.getAvg();
    s2.getPassCount();

    s3.input();
    s3.show();
    Student.totalStudents();
    }
}
class Student {
    private static int UniqueNo;
    private int RollNo;
    private String Name;
    private int[] subject;
    private int TotalMark;

    static {
        UniqueNo = 0;
        }

        Student() {
            UniqueNo++;
            this.RollNo = UniqueNo;
            this.subject = new int[5];
        }

        public void input() {
            Scanner MyObj = new Scanner(System.in);
            System.out.print("Enter Your Naam : ");
            this.Name = MyObj.nextLine();
            for (int i=0;i<this.subject.length;i++){
                System.out.print("Mark :");
                this.subject[i]=MyObj.nextInt();
            }
            this.TotalMark=this.Totalmark();
        }

        public void show() {
            System.out.println("Your RollNum is :"+" "+this.RollNo);
            System.out.println("Your Name is :" + " " + this.Name);
            System.out.println("Your Marks is :" + " " + Arrays.toString(this.subject));
        }

        public static void totalStudents() {
            System.out.println("Total Student = "+UniqueNo);
        }

        public int Totalmark() {
            int sum=0;
            for (int i = 0; i < subject.length; i++) {
                sum +=subject[i];
            }
            return sum;
        }

        public void getHighest(){
            int hight=0;
            for (int i = 0; i < subject.length; i++){
                if (hight<subject[i]){
                    hight=subject[i];
                }

            }
            System.out.println("highest mark from all sub : "+hight);
        }
        public void getLowest(){
            int Lowest=subject[0];
            for (int i = 1; i < subject.length; i++){
                if (Lowest>subject[i]){
                    Lowest=subject[i];
                }
            }
            System.out.println("Lowest mark from all sub : "+Lowest);
        }
        public void getAvg(){
            double avg=this.TotalMark;
            System.out.println("your Totalmark avg is : "+avg/subject.length);
        }
        public void getPassCount(){
            int count=0;
            for (int i=0;i<subject.length;i++){
                if (50<=subject[i]){
                    count++;
                }
            }
            System.out.println("You passed sub is :" +count);
        }
    }