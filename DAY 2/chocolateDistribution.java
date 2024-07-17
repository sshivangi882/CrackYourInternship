// package DAY 2;
import java.util.Arrays;
public class chocolateDistribution {

    public static int chocolateDistribution(int[] arr, int m){
        int n = arr.length;
        if(m == 0 || n == 0){
            return 0;
        }
        if(n < m){
            return -1;
        }
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i+m-1<n; i++){
            int diff = arr[i+m-1] - arr[i];
            if(diff < minDiff){
                minDiff = diff;
            }
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        System.out.println(chocolateDistribution(arr, m));
    }
}
