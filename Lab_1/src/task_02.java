import java.util.Scanner;

public class task_02 {
     public static void main(String[] argv) {
         System.out.println("Task 2");
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter current time in seconds (from 0 to 86399):");
         int input_num = scan.nextInt();
         if (input_num < 0){
             System.out.println("Wrong input: " + input_num + " time conversion is not possible");
             return;
         }
         int days = input_num / 86400;
         int times1 = input_num - (days * 86400);
         int hours = times1 / 3600;
         int times = times1 - (hours * 3600);
         int minutes = times / 60;
         int seconds = times - (minutes * 60);

         String str_min = "";
         String str_seconds = "";
         if (minutes < 10){
             str_min = "0" + minutes;
         }
         else {
             str_min = "" + minutes;
         }
         if (seconds < 10){
             str_seconds = "0" + seconds;
         }
         else {
             str_seconds = "" + seconds;
         }
         System.out.println("Current time is "+hours+":"+str_min+":"+str_seconds);
     }
}