import java.util.Scanner;

public class task_03 {
    final static int password = 231;
    public static void main(String[] argv){
        System.out.println("Task 3");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter password:");
        int int_passwd = scan.nextInt();
        if (int_passwd == password){
            System.out.println("Hello Agent!");
        }
        else {
            System.out.println("Access denied!");
        }
    }
}