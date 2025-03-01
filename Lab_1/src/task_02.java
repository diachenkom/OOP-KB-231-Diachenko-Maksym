import java.util.Scanner;

public class task_02 {
     public static void main(String[] argv) {
         System.out.println("Task 2");
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter current time in seconds (from 0 to 86399):");
         Integer input_num = scan.nextInt();
         if ((input_num < 0)||(input_num > 86399)){
             System.out.println("Wrong input: " + input_num + " time conversion is not possible");
             return;
         }

         int hours = input_num / 3600;
         int times = input_num - (hours * 3600);
         int minutes = times / 60;
         int seconds = times - (minutes * 60);

         String str_hours = "";
         String str_min = "";
         String str_seconds = "";
         if (hours < 10){
             str_hours = "0" + hours;
         }
         else {
             str_hours = "" + hours;
         }
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
         System.out.println("Current time is "+str_hours+":"+str_min+":"+str_seconds);
     }
}