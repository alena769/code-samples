import java.util.Arrays;

public class twoNumberSum {
    public static void main(String[] args) {
        int[] array = {3,5,-4,8,11,-1,1,6};
        int targetSum = 10;
        System.out.println(Arrays.toString(twoNumberSum(array, targetSum)));

    }
    public static int[] twoNumberSum(int[] array, int  targetSum) {
        for (int i = 0; i < array.length -1; i++) {
            int firstN = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int secN = array[j];
                if(firstN+secN == targetSum){
                    return new int[] {firstN, secN};
                }
            }
        }
        return new int[0];
    }
}
