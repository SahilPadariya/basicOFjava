package HashSet;

import java.util.*;

public class SameObjCheckStoreOrNot {
    public static void main(String[] args) {
        HashSet<student>set=new HashSet<>();

        student s1=new student(1,"sahil");
        student s3=new student(1,"sahil");

        set.add(s1);
        set.add(s3);

        for (student num : set){
            System.out.print(num.getId()+" = "+num.getName());
            System.out.println();
        }
    }
}
class student{
    int id;
    String name;
    student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this==o){
            return true;
        }
        if (o==null){
            return false;
        }
        if (getClass() != o.getClass()){
            return false;
        }
        student other = (student)o;
        return id==other.getId() && Objects.equals(name,other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
