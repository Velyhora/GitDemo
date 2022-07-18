package InterviewTasks;

public class findSumDigits {

    public static void main(String[] args) {

       // How to find the sum of digits from a given number?

        int number = 4577;
        int originalNum = number;
        int sum = 0;
        // 4577- 457 - 45 - 4 - 0
        while (number > 0){
        sum = sum +(number % 10);
        number = number / 10;
        }
        System.out.println("The sum of "+originalNum+" is equals to "+sum);
                 // OUTPUT: The sum of       4577      is equals to    23

    }
}
