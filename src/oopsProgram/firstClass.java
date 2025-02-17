package oopsProgram;

import javax.naming.Name;

public class firstClass {
    public static void main(String[] args) {
        student s1=new student();
        s1.setStudDetails(10,"RahulBhai",80,90,96);
        student s2 = new student();
        s2.setStudDetails(11,"mayank",90,80,60);
        s2.calculateTotal();
        s2.displayStudDetails();
        s1.calculateTotal();
        s1.displayStudDetails();
    }
}
//class
class student {
    private int rNum;
    private String Name;
    private int mark1;
    private int mark2;
    private int mark3;
    private int totalMarks;

    //parameters
    public void setStudDetails(int rNum, String Name, int mark1, int mark2, int mark3) {
        this.rNum = rNum;
        this.Name = Name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    //calculateTotal
    public void calculateTotal(){
        totalMarks=mark1+mark2+mark3;
    }
    //Display student detail
    public void displayStudDetails(){
        System.out.println(Name);
        System.out.println(rNum);
        System.out.println(totalMarks);
    }
}