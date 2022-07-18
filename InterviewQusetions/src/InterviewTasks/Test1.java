package InterviewTasks;

import java.util.*;

public class Test1 {
    public static int DistinctList(int[] arr) {
        // code goes here
        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        Set<Integer> keys= map.keySet();
        int willBeReturned =0;
        for(Integer key: keys){
            if(map.get(key)>1){
                int countDuplicate = map.get(key)-1;
                willBeReturned +=countDuplicate;
            }
        }

        return willBeReturned;}


    public static void main (String[] args) {
        // keep this function call here

        System.out.print(DistinctList(new int[]{2,2,2,1,1,0,9,7}));
    }

}
