import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        System.out.printf("Task №1\n");
        Scanner scan = new Scanner(System.in);
        System.out.printf("Input text:");
        String new_str = scan.nextLine();
        System.out.println("Hello " + new_str);
    }
}