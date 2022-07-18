package InterviewTasks;

import java.util.LinkedHashSet;

public class removeAllDuplicatesArray {

    // remove duplicate values from an array?


    public static void removesDuplicates(int[] a){
        LinkedHashSet <Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        int a[] ={5,4,7,6,3,4,5,6,8,3,9};
        removesDuplicates(a);
    }
}


