package String;

public class StringPractice {
    public static void main(String[] args) {
        String word1[]={"abc","d","defg"};
        String word2[]={"abcddef"};
        int i = 0, j = 0;
        int pointer1 = 0, pointer2 = 0;
        while (i < word1.length && j < word2.length) {
            char ch1 = word1[i].charAt(pointer1);
            char ch2 = word2[j].charAt(pointer2);
            if (ch1 != ch2) {
                System.out.println("false");
                return;
            }
            pointer1++;
            pointer2++;
            if (pointer1 == word1[i].length()) {
                i++;
                pointer1 = 0;
            }
            if (pointer2 == word2[j].length()) {
                j++;
                pointer2 = 0;
            }
        }
        if (i==word1.length && j==word2.length){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}