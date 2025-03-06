import java.util.Scanner;

public class task_08 {
    public static void main(String[] args) {
        System.out.println("Task 8");
        Scanner scan = new Scanner(System.in);
        double num1 = 0, i = 0;
        while (true){
            System.out.println("Enter integer number (enter 0 to exit):");
            double num = scan.nextDouble();
            if (num == 0){
                System.out.println("Exit program");
                break;
            }
            num1 = num1 + num;
            i++;
        }
        double middle = num1 / i;
        System.out.println("The middle value is: " + middle);
    }
}