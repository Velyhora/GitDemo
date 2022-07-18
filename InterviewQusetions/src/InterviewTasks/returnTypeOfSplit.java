package InterviewTasks;

public class returnTypeOfSplit {

    public static void main(String[] args) {

        // What is the return type of split() method?
        // NOTE: Return type of split method is String array.

        String techtorial ="Techtorial interview preparation document. ";
        String [] words = techtorial.split(" "); // will split the string with the spaces.
        System.out.println(words.length);
        for (String string : words) {
            System.out.println(string);
        }
    }
}
