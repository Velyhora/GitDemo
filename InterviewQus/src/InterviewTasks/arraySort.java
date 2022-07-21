package InterviewTasks;


import java.util.Arrays;
public class arraySort {



    public static void main(String args[]) {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
//     public static void main(String[] args)  {
//        // Custom input array
//        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 };
//
//        // Applying sort() method over to above array
//        // by passing the array as an argument
//        Arrays.sort(arr);
//
//        // Printing the array after sorting
//        System.out.println("Modified arr[] : "
//                + Arrays.toString(arr));
//    }

}

