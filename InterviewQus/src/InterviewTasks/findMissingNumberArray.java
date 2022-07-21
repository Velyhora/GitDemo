package InterviewTasks;

import java.util.Arrays;

public class findMissingNumberArray {

    public static void main(String[] args) {

        // How to find the missing number in an array?

        // this example only for the numbers between 0 to 9 and only finds the one missing number
        int [] arr ={0,4,2,3,6,8,1,9,7};
        // find missing number from given array // 0, 1,2,3,4... 9
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int num = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != num){
                System.out.println(num);
                break;
            }
            num++;
        }
    }
}
