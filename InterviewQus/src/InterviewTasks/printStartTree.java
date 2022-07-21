package InterviewTasks;

public class printStartTree {

    public static void main(String[] args) {

        // How to print the start tree?

//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
        int row = 5;
        for(int i = 1; i <= row; i++) {
            for (int k = 1; k <= row - i; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
        }
    }
}
