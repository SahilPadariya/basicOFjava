package HashMap;

import java.util.Arrays;
import java.util.Objects;

public class HashMapDesign {
    public static void main(String[] args) {
        MyHashMap<Person,String> map=new MyHashMap();

        Person p1=new Person(10,"Keshav");
        Person p2=new Person(20,"Dhruv");
        Person p3=new Person(10,"Keshav");

        map.put(p1,"Manger");
        map.put(p2,"employee");
        map.put(p3,"HR");

        map.print();

        System.out.println(map.size);
    }
}
class Person{
    int id;
    String name;
    Person(int id,String name){
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person)obj;
        return this.id==other.getId() && Objects.equals(this.name,other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }
}

class MyHashMap<k,v> {
    int size=0;
    class node<k,v> {
        k key;
        v value;
        node<k,v> next;

        node(k key, v value) {
            this.key = key;
            this.value = value;
        }
    }
    int length = 16;
    node[] bucket=new node[length] ;

    //this getindex function is give me index of patricular key :
    public int getindext(k key) {
        return Math.abs(key.hashCode()) % bucket.length;
    }

    //this put function is add value and key in given index :
    public void put(k key, v value) {
        int index = getindext(key);
        node<k,v> nn = new node<>(key, value);

        if (bucket[index] == null) {
            bucket[index] = nn;
            size++;
        } else {
            node<k,v> temp = bucket[index];
            while (temp.next != null && !temp.key.equals(key)) {
                temp = temp.next;
            }
            if (temp.key.equals(key)) {
                temp.value = value;
            } else {
                temp.next = nn;
                size++;
            }
        }
        if (size/length >= 0.75){
            rehash();
        }
    }

    //rehashing of arr size :
    private void rehash() {
        node<k,v>[] oldbucket=bucket;
        int newlength = length*2;
        bucket = new node[newlength];
        size=0;

        for (int i=0;i<oldbucket.length;i++){
            node<k,v> temp=oldbucket[i];
            while (temp != null){
                put(temp.key, temp.value);
                temp=temp.next;
                size++;
            }
        }
        length=newlength;
    }

    //this print function is print all node's data :
    public void print() {
        for (int i = 0; i < bucket.length; i++) {
            node<k,v> temp = bucket[i];
            while (temp != null) {
                System.out.println(temp.key + " = " + temp.value);
                temp = temp.next;
            }
        }
    }

    //this get finction is return given key value :
    public void get(k key) {
        int index = getindext(key);

        node<k,v> temp = bucket[index];

        while (temp != null && !temp.key.equals(key)) {
            temp = temp.next;
        }
        if (temp==null){
            System.out.println("null");
        }
        else if (temp.key.equals(key)) {
            System.out.println(temp.value);
        }
    }
}
