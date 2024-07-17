
class MergeTwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i= m-1;
        int j= n-1;
        int k= m+n-1;

        while(j>= 0){
            if(i >= 0 && nums1[i]>nums2[j]){
                nums1[k--]= nums1[i--];

            }else{
                nums1[k--]= nums2[j--];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int m = 3;
        int n = 3;
        MergeTwoSortedArray obj = new MergeTwoSortedArray();
        obj.merge(arr1, m, arr2, n);
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}