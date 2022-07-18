package InterviewTasks;

import java.util.Arrays;

public class reverseArray {

    public static void main(String[] args) {

        // How to reverse the array?

        int nums [] ={45,62,7,67, 23,35,11};
        for(int i = 0; i < nums.length / 2; i++){ //i=3
            int temp = nums[i]; //7
            nums[i] = nums[nums.length-i-1]; // 35
            nums [nums.length-i-1] = temp; // 7
        }
        System.out.println(Arrays.toString(nums));

        String str [] ={"Ahmed","Amir","Ramis","Mohsen","Enas","Maria","Marwah"};
        for(int i = 0; i < str.length / 2; i++){
            String s = str[i];
            str[i] = str[str.length-i-1];
            str [str.length-i-1] = s;
        }
        System.out.println(Arrays.toString(str));
    }
}
