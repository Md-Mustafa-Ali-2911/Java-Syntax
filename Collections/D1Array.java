import java.util.*;

public class D1Array {

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);

        System.out.print("Sorted array : " + Arrays.toString(arr));
    }
     
    public static void main(String args[]) {
        int[] num = {5, 2, 9, 1, 7};

        sortArray(num);
    }
}