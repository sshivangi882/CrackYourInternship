import java.util.HashSet;

public class DuplicateNumber {
   
    public static int findDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int x:nums){
        if(set.contains(x))
            return x;
        set.add(x);
       }
       return 0;
    }
    public static void main(String[] args) {
        DuplicateNumber dn = new DuplicateNumber();
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(dn.findDuplicate(arr));
    }

}
