package InterviewTasks;

import java.util.Arrays;

public class sortArrayWithoutSortMethod {

    public static void main(String[] args) {

        // How to sort the array without the sort method?
        int [] nums = {3,7,6,2,9};
        for(int i = 0; i < nums.length; i++){
            int temp = 0;
            for(int k = i + 1; k < nums.length; k++){
                if(nums[i] > nums[k]){
                    temp = nums[i];
                    nums[i] = nums[k];
                    nums[k] = temp;
                }
            }
        } System.out.println(Arrays.toString(nums));


    }

}
