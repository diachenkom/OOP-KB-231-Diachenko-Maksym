import java.util.Scanner;

public class task_04 {
     public static void main(String[] argv){
        System.out.println("Task 4");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of people:");
        int number = scan.nextInt();
        String human = "";
        if (number <= 0){
            System.out.println("Wrong input");
            return;
        }

        for (int i=1; i <= number; i++){
            System.out.println("Enter person № " + i + ":");
            Scanner scan2 = new Scanner(System.in);
            human = scan2.nextLine();
            System.out.println("Hello, " + human + "!\n");
        }
     }
}