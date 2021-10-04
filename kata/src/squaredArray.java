import java.util.Arrays;

public class squaredArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,8,9};
        System.out.println(Arrays.toString(squaredArray(array)));
    }
    public static int[] squaredArray(int[] array) {

        int[] squaredSorted = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int squaredN = array[i] * array[i];
            squaredSorted[i] = squaredN;
        }
        Arrays.sort(squaredSorted);
        return squaredSorted;
    }

}
