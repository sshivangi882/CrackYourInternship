import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicatesinArray {

    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                arr.add(nums[i-1]);
                // arr.add(nums[i]);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        FindDuplicatesinArray obj = new FindDuplicatesinArray();
        System.out.println(obj.findDuplicates(arr));
    }
}
