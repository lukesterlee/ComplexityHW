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

    public static void main(String[] args) {
	// write your code here
    }
}
