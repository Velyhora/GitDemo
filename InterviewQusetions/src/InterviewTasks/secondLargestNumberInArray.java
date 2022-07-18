package InterviewTasks;

import java.util.Arrays;

public class secondLargestNumberInArray {

    public static void main(String[] args) {
        // Write a java program to find the second largest number in the array?
        // Maximum and minimum number in the array?

        // easiest way
        int[] numArray= {12,13,12,15,0, -1};
        Arrays.sort(numArray);
        System.out.println(Arrays.toString(numArray));
        System.out.println(numArray[numArray.length-2]);
        System.out.println("==================================");

        // Interview solution
        int[] array = {100, 300, 200, 450,350};
        int largest = array[0];
        int secondLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        System.out.println("The largest number=" + largest + " and secondLargest=" + secondLargest);


    }
}
