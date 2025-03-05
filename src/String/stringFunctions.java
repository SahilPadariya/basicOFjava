package String;

import java.util.Locale;

public class stringFunctions {
    public static void main(String[] args) {
        String name="Sahil Padariya";
        String name1="sahil";
        System.out.println("lenght = "+name.length());
        System.out.println("find index = "+name.charAt(0));
        System.out.println("concat = "+name.concat(name1));
        System.out.println("is empty = "+name.isEmpty());
        System.out.println("equal ignore ther are ignore upper lower = "+name.equalsIgnoreCase(name1));
        System.out.println("upper case = "+name.toUpperCase());
        System.out.println("lower case = "+name.toLowerCase());
        System.out.println("extra space delete = "+name1.trim());
        System.out.println("cheak all same or not"+name.equals(name1));
        System.out.println("Some start to end index iutput which you enter = "+name.substring(3,9));
        System.out.println("give index for start substring = "+name.indexOf("Padariya"));
        System.out.println("your speling misteck make right = "+name.replace("a","A"));
        System.out.println("check in word substring have or no = "+name.contains("Sahil Padariya"));
        System.out.println("check this word start yes or no = "+name.startsWith("Padariya"));


    }

}
