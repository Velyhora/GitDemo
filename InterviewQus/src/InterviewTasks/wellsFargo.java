package InterviewTasks;

public class wellsFargo {


    public static boolean result (int num1, int num2) {

        String[] numbers = ("" + num1).split("");
        int[] nums = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }

        for (int j = 0; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[j] + nums[k] == num2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n1 = 1234;
        int n2 = 20;
        System.out.println(result(n1,n2));
    }
    }
