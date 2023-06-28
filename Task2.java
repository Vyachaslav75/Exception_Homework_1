import java.util.Arrays;
import java.util.Random;

public class Task2 {
    static Random rn = new Random();

    public static void main(String[] args) {
        int[] arr1 = genArray();
        int[] arr2 = genArray();
        if (arr1.length != arr2.length) {
            System.out.println("Ошибка. Массивы разной длины.");
        } else {
            System.out.println(Arrays.toString(processArray(arr1, arr2)));
        }

    }

    static int[] genArray() {
        int[] arr = new int[rn.nextInt(10) + 2];
        // int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(8);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    static int[] processArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            arr[i] = arr1[i] - arr2[i];
        }
        return arr;

    }
}
