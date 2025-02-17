package array;

public class maxvalue {
    public static void main(String[] args) {
        int []array={10,20,30,1,5,0,2};
        int n= array.length;
        int min = array[0];
        for(int i=0;i<n;i++){
            if(min<array[i]){
                continue;
            }
            else {
                min=array[i];
            }
        }
        System.out.println(min);
    }


}
