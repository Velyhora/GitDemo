package InterviewTasks;

public class reverseString {

    public static void main(String[] args) {

        // Write a java program to reverse String? Reverse a string word by word?

        // Reverse String:
        // * Using Reverse Function: StringBuffer
        String word= "Hello Techtorial";
        StringBuffer sb=new StringBuffer(word);
        System.out.println(sb.reverse());

        // * Using Reverse Function: StringBuilder
        String word1 = "Hello Techtorial";
        StringBuilder sb1 =new StringBuilder(word1);
        System.out.println(sb1.reverse());

        System.out.println("*******************************");

        // Without Using Reverse Function:
        String toReverse="Hello Techtorial";

        // 1 way using charAt();
        String reversed="";
        for (int i = toReverse.length()-1; i >= 0; i--) {
            reversed += toReverse.charAt(i);
        }
        System.out.println("Reversed String is: "+reversed);

        //2 way using to charArray();
        String reversed1="";
        char[] array = toReverse.toCharArray();
        for (int i = array.length-1; i >= 0; i--) {
            reversed1 += array[i];
        }
        System.out.println("Reversed String is: "+reversed1);

        System.out.println("*******************************");

        // Reverse a string word by word
        String str = "I love java";
        String reversed2 = "";
        String [] array2 = str.split(" ");
        for (int i = array2.length - 1; i >= 0; i--) {
            reversed2 = reversed2 + array2[i]+" ";
        }
        System.out.println(reversed2); // output: java love I

        // ****Reverse each word in the sentence****
        String str1 = "I love java";
        String reversed3 = "";
        String [] array3 = str1.split(" ");
        for (int i = 0; i < array3.length; i++) {
            String word3="";
            for(int j = array3[i].length()-1; j >= 0; j--){
                word3 += array3[i].charAt(j);
            }
            reversed3 = reversed3 + word3+" ";
        }
        System.out.println(reversed3); // OUTPUT: I evol avaj


    }
}
