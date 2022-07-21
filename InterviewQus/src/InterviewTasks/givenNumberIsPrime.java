package InterviewTasks;

public class givenNumberIsPrime {

    public static void main(String[] args) {

        // Write a java program to check whether a given number is prime or not?

        int num = 29;
        boolean flag = false;

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) { // condition for non prime number
            flag = true;
            break;
            }
        }
        if (!flag){
        System.out.println(num + " is a prime number.");
        }else{
        System.out.println(num + " is not a prime number.");
        }
    }
}
