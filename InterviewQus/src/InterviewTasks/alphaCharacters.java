package InterviewTasks;

public class alphaCharacters {

    public static void main(String[] args) {

        // Find out how many alpha characters present in a string?

        String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String replaced=given.replaceAll( "[^A-Za-z]" , "" );
        System.out.println(replaced.length());

        System.out.println("*********************************");

        String result = "";
        for (int i = 0; i < given.length(); i++) {
            char ch = given.charAt(i);
            if (Character.isAlphabetic(ch) && !Character.isDigit(ch)){
                result += ch + "";
            }
        }
        System.out.println(result);
        System.out.println("*********************************");
        System.out.println("*********************************");
        System.out.println("*********************************");
    }
}
