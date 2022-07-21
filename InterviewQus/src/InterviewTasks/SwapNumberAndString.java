package InterviewTasks;

public class SwapNumberAndString {

    // Write a program to swap 2 numbers without a temporary variable?
    // Swap 2 strings without a temporary variable?
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        a = a + b;// first this should be there a=5+10=15
        b=a-b; // b= 15-10=5
        a = a - b; //a=15-5=10
        System.out.println(a);
        System.out.println(b);
        System.out.println("===================================");

        String x="Hello";
        String y="Techtorial";
        x=x+y; //HelloWelcome
        // y = x.substring(0,5);
        // x = x.substring(5);
        y=x.substring(0,x.length()-y.length());
        x=x.substring(y.length());
        System.out.println(x);// --> Techtorial
        System.out.println(y);// --> Hello

    }
}
