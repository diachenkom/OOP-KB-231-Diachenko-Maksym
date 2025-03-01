import java.util.Scanner;

public class task_07 {
    public static void main(String[] args) {
        System.out.println("Task 7");
        int num1 = 0;
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Enter integer number (enter 0 to exit):");
            int num = scan.nextInt();
            if (num == 0){
                System.out.println("Exit program");
                break;
            }
            if (num > num1){
                num1 = num;
            }
        }
        System.out.println("Max number is: " + num1);
    }
}