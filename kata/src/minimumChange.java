import java.util.Arrays;

public class minimumChange {
    public static void main(String[] args) {
        int[] coins = {5, 7, 1, 1, 2, 3, 22};

        System.out.println(minimumChange(coins));


    }
    public static int minimumChange(int[] conis) {

        Arrays.sort(conis);

        int currentChange = 0;

        for (int coin : conis) {
            if(coin > currentChange + 1){

                return currentChange + 1;
            }else {

                currentChange += coin;
            }
        }

        return currentChange + 1;
    }
}
