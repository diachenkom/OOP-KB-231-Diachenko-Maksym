import java.util.Scanner;

public class task_05 {
    public static void main(String[] argv) {
        System.out.println("Task 5");
        Scanner scan = new Scanner(System.in);
        System.out.println("A snail climbs a tree 'a' foot per day. " +
                "Then, each night, the snail slides down 'b' feet. " +
                "The tree is 'h' feet tall.");
        System.out.println("Enter a:");
        int a = scan.nextInt();
        System.out.println("Enter b:");
        int b = scan.nextInt();
        System.out.println("Enter h:");
        int h = scan.nextInt();

        if (a >= h){
            System.out.println("A snail climbs for 1 day");
            return;
        }
        if ((a <= b)&&(a < h)){
            System.out.println("Impossible");
            return;
        }
        if ((a > b)&&(a < h)){
            int lift=0, days=0;
            while (lift < h){
                lift = lift + a;
                days = days +1;
                if (lift >= h){
                    System.out.println("A snail climbs for " + days + " days");
                    break;
                }
                lift = lift - b;
            }
        }
    }
}
