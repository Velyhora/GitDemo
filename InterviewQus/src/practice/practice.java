package practice;

public class practice {

    public static void main(String[] args){

        String str = "I Love Java";
        String reversed = "";
        String [] array = str.split(" ");

        for (int i = array.length-1; i >=0 ; i--) {
            reversed = reversed + array[i]+" ";
        }
        System.out.println(reversed);
    }
}
