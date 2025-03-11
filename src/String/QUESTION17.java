package String;

public class QUESTION17 {
    public static void main(String[] args) {
        String s1="SAHIL",s2="rahul";
        if (s1.length()!=s2.length()){
            System.out.println("length no same");
            return;
        }
        char a1[]=s1.toCharArray(),a2[]=s2.toCharArray();
        for (int i=0;i<a1.length;i++){
            char temp=a2[i];
            a2[i]=a1[i];
            a1[i]=temp;
        }

//        System.out.println(Integer.parseInt(s2));

        s1=new String(a1);s2=new String(a2);
        System.out.println(s1+"-"+s2);
    }
}
