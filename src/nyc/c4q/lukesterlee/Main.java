package nyc.c4q.lukesterlee;

import java.util.Arrays;

public class Main {

    public static int findMissingNumber(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1)
                return array[i];
        }
        return -1;
    }

    public static int betterWay(int[] array) {
        boolean[] imnotmissing = new boolean[array.length];
        for (int n : array) {
            imnotmissing[n - 1] = true;
        }
        for (int i = 0; i < imnotmissing.length; i++) {
            if (!imnotmissing[i])
                return i+1;
        }
        return -1;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
