public class task_12 {
    static boolean[] bool_array = {false, false, false, false, false, false, false, false};
    public static void main(String[] argv){
        int[] numbers = {1, -1, 0, 4, 6, 10, 15, 25};
        System.out.println("Array of integers:\n");
        for (int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
        getSumCheckArray(numbers);
        for (int i=0; i < bool_array.length; i++){
            System.out.print(bool_array[i] + ", ");
        }
    }

    public static void getSumCheckArray(int[] array){
        for (int i=2; i < array.length; i++){
            bool_array[i] = (array[i] == array[i-1] + array[i-2]);
        }
    }
}