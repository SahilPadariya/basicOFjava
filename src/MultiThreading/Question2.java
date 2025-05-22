package MultiThreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<Student>list=new ArrayList<>();
        list.add(new Student(1,"sahil",520));
        list.add(new Student(2,"Rahul",465));
        list.add(new Student(3,"Mayank",50));
        Collections.sort(list );
        for (Student s : list){
            System.out.println(s.RollNo+" - "+s.Name+" - "+s.Marks);
        }
    }
}
class Student implements Comparable<Student>{
    int RollNo;
    String Name;
    int Marks;
    Student(int Roll,String Name,int Marks){
        this.RollNo=Roll;
        this.Name=Name;
        this.Marks=Marks;
    }

    @Override
    public int compareTo(Student o) {
        if (this.Marks>o.Marks){
            return 1;
        } else if (this.Marks<o.Marks) {
            return -1;
        }else {
            return 0;
        }
    }
}
