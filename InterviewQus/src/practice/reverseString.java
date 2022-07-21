package practice;

public class reverseString {
    public static void main(String[] args) {

        String str = "United States of America";
        String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);



        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());


    }
}
