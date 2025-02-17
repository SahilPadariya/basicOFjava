package oopsProgram;

public class TopThreeStudent {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setdetail(1,"RAHUL",90,98,7);
        Student s2=new Student();
        s2.setdetail(2,"MAYANK",60,60,80);
        Student s3=new Student();
        s3.setdetail(3,"URVESH",50,80,80);
        Student s4=new Student();
        s4.setdetail(4,"NAKUL",5,60,80);
        Student s5=new Student();
        s5.setdetail(5,"SUJAL",50,60,8);
        Student arr[]=new Student[5];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        arr[3]=s4;
        arr[4]=s5;
    }
    public void getTop3(Student[] arr){
        for (int i=0 ; i<arr.length;i++){
            for (int j=0 ; j<arr.length-i-1;j++){
                if (arr[j].calculate()<arr[j+1].calculate()){
                    Student temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
class Student{
    private int rollnum;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;
    private int totalmark;

    public void setdetail(int rollnum,String name,int mark1,int mark2,int mark3){
        this.rollnum=rollnum;
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.totalmark=calculate();
    }
    public int calculate(){
        return  mark1+mark2+mark3;
    }
}
