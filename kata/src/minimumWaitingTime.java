import java.util.Arrays;

public class minimumWaitingTime {
    public static void main(String[] args) {
        int[] queries = {3,2,1,2,6};
        System.out.println(minimumWaitingTime(queries));
    }

    public static int minimumWaitingTime(int[] queries) {

        Arrays.sort(queries);

        int waitingTime = 0;

        for (int i = 1; i < queries.length; i++) {
            waitingTime += queries[i];
        }

        return waitingTime;
    }

}
