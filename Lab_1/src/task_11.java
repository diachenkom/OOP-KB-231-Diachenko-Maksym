public class task_11 {
    public static void main(String[] argv){
        System.out.println("Task 10");
        int [] numbers = {1,4,6,12,8};
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }

        System.out.println("\nThe sum of even numbers is: " + sum(numbers));
    }

    public static int sum(int[] array){
        int sum1 = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                sum1 = sum1 + array[i];
            }
        }
        return sum1;
    }
}