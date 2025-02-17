package OOPs;

import java.util.Arrays;

public class FindTop3Students {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.setdetail(1, "RAHUL", 9, 9, 7);
        Student2 s2 = new Student2();
        s2.setdetail(2, "MAYANK", 0, 60, 0);
        Student2 s3 = new Student2();
        s3.setdetail(3, "URVESH", 50, 80, 80);
        Student2 s4 = new Student2();
        s4.setdetail(4, "NAKUL", 5, 60, 80);
        Student2 s5 = new Student2();
        s5.setdetail(5, "SUJAL", 0, 0, 8);
        Student2 arr[] = new Student2[5];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = s4;
        arr[4] = s5;
        Student2[] top3Stud=new Student2[3];
        top3Stud=getTop3(arr);
        displayTopStudList(top3Stud);
    }
    public static void displayTopStudList(Student2[] topStudList){
        for(int i=0;i<topStudList.length;i++){
            topStudList[i].displayDetails();
        }
    }
    public static Student2[] getTop3(Student2[] arr) {
        Student2 arr2 []=new Student2[3];
        int max1=0;
        int max2=0;
        int max3=0;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i].calculate() > max1) {
                    max3=max2;
                    max2=max1;
                    max1 = arr[i].calculate();
                    arr2[2]=arr2[1];
                    arr2[1]=arr2[0];
                    arr2[0]=arr[i];
                } else if (arr[i].calculate()>max2 && arr[i].calculate() <= max1){
                    max3=max2;
                    max2=arr[i].calculate();
                    arr2[2]=arr2[1];
                    arr2[1]=arr[i];
                } else if (arr[i].calculate()>max3&&arr[i].calculate()<=max2) {
                    max3 = arr[i].calculate();
                    arr2[2]=arr[i];
                }
        }
        return arr2;
    }
}
class Student2 {
    private int rollnum;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;
    private int totalmark;

    public void setdetail(int rollnum, String name, int mark1, int mark2, int mark3) {
        this.rollnum = rollnum;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.totalmark = calculate();
    }
    public int calculate() {
        return mark1 + mark2 + mark3;
    }
    public void displayDetails() {
        System.out.print(this.rollnum+" ");
        System.out.print(this.name+" ");
        System.out.println(this.totalmark);
    }
}