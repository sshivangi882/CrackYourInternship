// package DAY 1;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target){
        int l=0;
        int h = arr.length-1;
        while(l<=h){
            int sum= arr[l]+ arr[h];
            if(sum==target){
                return new int[]{l+1, h+1};
            }else if(sum >target){
                h--;
            }else{
                l++;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
        
    }
    
}
