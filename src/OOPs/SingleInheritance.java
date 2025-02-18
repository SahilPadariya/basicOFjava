package OOPs;

import java.util.Scanner;

public class SingleInheritance {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="sahil";
        stud s1=new stud();
        s1.name="mayank";
        s1.Same=6;
        Professor p2=new Professor();
        p2.gets();
        p2.Same=7;
        Shop S1=new Shop();
        S1.name="Ultimate Computer";
        Teacher t1= new Teacher();
        t1.name="Ankur Lathiya Sir";
        t1.salary=5300000;
        S1.Location="Amroli Char Rasta,Surat";
        System.out.println(p1.name+" "+s1.name);
        System.out.println(s1.Same);
        System.out.println(p2.Same);
        System.out.println(S1.name);
        System.out.println(S1.Location);
        System.out.println(t1.name);
        System.out.println(t1.salary);
    }
}

//Single Inheritance / Multilevel

class Person{
    String name;
    int age;
}
class stud extends Person{
    int Rno;
    int Same;
}
class Professor extends stud{
    String[] sub;
    public void gets(){
        System.out.println("i am professor");
    }
}

//hierarchical Inheritance

class Shop extends Person{
    String Location;
}

//Hybrid Inheritance

class Teacher extends Person{
    int salary;
}

