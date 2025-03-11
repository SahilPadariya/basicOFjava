package String;

public class Question18 {
    public static void main(String[] args) {
        String s1="aa",s2="bb";
        if (s1.length() != s2.length()){
            System.out.println("not permuting");
            return;
        }
        int a1[]=new int[128];

        for (int i=0;i<s1.length();i++){
            int asci1=s1.charAt(i);
            a1[asci1]+=1;
            int asci2=s2.charAt(i);
           if(a1[asci2]>0){
               a1[asci2]-=1;
           }else {
               a1[asci2] += 1;
           }
        }
        for (int i=0;i<a1.length;i++){
            if (a1[i]>0){
                System.out.println("not");
                return;
            }
        }
        System.out.println("permuting");
    }
}
