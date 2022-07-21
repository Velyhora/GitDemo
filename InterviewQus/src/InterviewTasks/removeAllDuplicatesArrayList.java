package InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class removeAllDuplicatesArrayList {

    public static void main(String[] args) {

        // How can you remove all duplicates from ArrayList?

        List<String> aList = Arrays.asList("John", "Jane", "James", "Jasmine", "Jane", "James");
        HashSet set = new HashSet(aList);
        System.out.println(set);

        List<Integer> aList1 = Arrays.asList(1,1,2,6,8,4,3,4,9,8,9,0);
        HashSet set1 = new HashSet(aList1);
        System.out.println(set1);

    }
}
