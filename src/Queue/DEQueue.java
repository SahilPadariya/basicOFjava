package Queue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DEQueue {
    static int arr[]=new int[10];
    static int infir=-1,delfir=-1,lasin=arr.length,lastdel=arr.length;
    public static void main(String[] args) {
        InFirst(10);
        InFirst(20);
        InFirst(30);
        InFirst(40);
        InFirst(50);
        InFirst(60);

        DelFir();

        LastIn(100);
        LastIn(90);
        LastIn(80);
        LastIn(70);

        LastDEl();
        LastDEl();
        LastDEl();

        System.out.println(Arrays.toString(arr));
    }

    public static void InFirst(int val){
        if(infir+1==lasin){
            System.out.println("arr is full");
            return;
        }
        else{
            infir++;
            arr[infir]=val;
        }
    }

    public static void DelFir(){
        if (delfir==infir){
            infir=delfir=-1;
        } else if (delfir==-1 && infir==-1) {
            System.out.println("arr is empty");
            return;
        }else {
            delfir++;
            arr[delfir] = 0;
        }
    }

    public static void LastIn(int val){
        if(lasin-1==infir){
            System.out.println("arr is full");
            return;
        }
        else{
            lasin--;
            arr[lasin]=val;
        }
    }

    public static void LastDEl(){
        if (lastdel==lasin){
            lastdel=lasin=arr.length;
        } else if (lastdel==arr.length && lasin==arr.length) {
            System.out.println("arr is empty");
            return;
        }else {
            lastdel--;
            arr[lastdel] = 0;
        }
    }
}
