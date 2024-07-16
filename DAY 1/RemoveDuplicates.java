class RemoveDuplicates {
    public static int removeDuplicates(int[] arr){
        if (arr.length == 0) return 0;
        int idx = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] != arr[i]){
                arr[idx] = arr[i];
                idx++;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int newSize = rd.removeDuplicates(arr);
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}