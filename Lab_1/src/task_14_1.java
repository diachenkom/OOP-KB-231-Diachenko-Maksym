public class task_14_1 {
    static int[] numbers = {1, 2, 3, 4, 5};
    static int[] sortNumbers = {0, 0, 0, 0, 0};

    public static void main(String[] args){
        System.out.println("Task 14");
        System.out.println("Initial array:");
        for (int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nShifted array:");
        cycleSwap(numbers);
    }

    public static void cycleSwap(int[] array){
        for (int i=0; i < array.length; i++){
            if (i == array.length - 1){
                sortNumbers[0] = array[i];
                break;
            }
            sortNumbers[i+1] = numbers[i];
        }
        for (int i=0; i < sortNumbers.length; i++){
            System.out.print(sortNumbers[i] + " ");
        }
    }
}