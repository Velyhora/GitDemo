package InterviewTasks;

public class stringDoubleLetter {
    public static void main(String[] args) {
        String input = "Java is my main programming language";
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    System.out.print(input.charAt(i));
                }
            }

        }


    }
}
