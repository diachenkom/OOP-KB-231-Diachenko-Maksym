public class task_10 {
    public static void main(String[] argv){
        System.out.println("Task 10");
        int [] numbers = {1,4,6,76,356};
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }

        System.out.println("\nThe max value is: " + max(numbers));
    }

    public static int max(int[] array){
        int max_value = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max_value){
                max_value = array[i];
            }
        }
        return max_value;
    }
}