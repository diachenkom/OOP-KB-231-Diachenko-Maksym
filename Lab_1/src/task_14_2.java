import java.util.Arrays;

public class task_14_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Primary Massive");
        System.out.println(Arrays.toString(array));
        int shift = 3;
        System.out.println("Shift = " + shift);
        cycleSwap(array, shift);
    }

    public static void cycleSwap(int[] array, int shift) {
        int len = array.length-1;
        int[] ar1 = {0, 0, 0, 0, 0};
        if (len == 0 || shift == 0 || shift == len+1) {
            System.out.println("Massive is NOT Changed");
            return;
        }
        int curElem = 0;
        for(int i=0; i <= len; i++){
            if ((i + shift) <= len){
                curElem = array[i];
                ar1[i+shift]=curElem;
            }
            int rest=0;
            if ((i + shift) > len){
                rest=i + shift - len;
                curElem=array[i];
                ar1[rest -1]=curElem;
            }
        }
        System.out.println("\nMassive is shifted to " + shift);
        System.out.println(Arrays.toString(ar1));
    }
}