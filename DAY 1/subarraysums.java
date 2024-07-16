public class subarraysums {

    public static int subarraysumsdivbyK(int[] nums, int k){
        int count=0;
         for (int i = 0; i < nums.length; i++){
             int sum =0;
            
            for(int j=i;j<nums.length;j++){
               sum += nums[j];
               if(sum % k==0){
                count++;
               }
                 
            }
               
         }
         return count;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 0, -2, -3, 1};
        int k = 5;
        System.out.println(subarraysumsdivbyK(arr, k));
    }
}
