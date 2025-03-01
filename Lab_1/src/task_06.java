import java.util.Scanner;

public class task_06 {
    public static void main(String[] args) {
        System.out.println("Task 6");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sum:");
        double sum = scan.nextDouble();
        if (sum <= 0){
            System.out.println("Wrong input");
            return;
        }
        System.out.println("Enter number of friends:");
        double friends = scan.nextDouble();
        if (friends <= 0){
            System.out.println("Wrong input");
            return;
        }
        double each_sum = (sum * 1.1) / friends;
        System.out.println("Each of friends pays " + each_sum + " of money");
    }
}