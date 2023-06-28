import java.util.Arrays;
import java.util.Random;

public class Task3 {
    static Random rn = new Random();

    public static void main(String[] args) {
        double[] arr1 = genArray();
        double[] arr2 = genArray();
        // processArray(arr1, arr2);
        System.out.println(Arrays.toString(processArray(arr1, arr2)));

    }

    static double[] genArray() {
        double[] arr = new double[rn.nextInt(10) + 2];
        // double[] arr = new double[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(1, 8);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    static double[] processArray(double[] arr1, double[] arr2) {
        double[] arr = new double[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Ошибка. Массивы разной длины.");

        } else {
            for (int i = 0; i < arr2.length; i++) {
                arr[i] = arr1[i] / arr2[i];
            }

        }
        return arr;

    }
}
