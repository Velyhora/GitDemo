package InterviewTasks;

import java.util.ArrayList;

public class FindSumFromList {
    //Task input {1,2,3,4,5,6,7,8,9} Target 9
    //Output shouldBe
    //[ 7,2 ]
    //[ 6,3 ]
    //[ 5,4 ]


    public static void findSum9(ArrayList<Integer> nums){
        for(int i=0;i<nums.size();i++){
            for(int q=i+1;q<nums.size();q++){
                if(nums.get(q)+nums.get(i)==9){
                  System.out.println("[ "+nums.get(q)+","+nums.get(i)+" ]");
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);

        findSum9(nums);
    }
}
