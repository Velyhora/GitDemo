package practice;

public class DublicateLetter {

    public static void main(String[] args) {

String [] arr = {"Sasha", "Java","Method", "Class"};
        for (int i = 0; i < arr.length /2 ; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr [arr.length-i-1] = temp;


        }

        System.out.println();

    }
}
