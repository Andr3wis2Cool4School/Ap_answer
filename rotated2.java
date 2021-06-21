public class rotated2 {
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]) {
                high = pivot;
            } else if (nums[pivot] > nums[high]){
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return nums[low];
    }
    public static void main(String args[]){
        int [] nums1 = {1, 3, 5};
        int [] nums2 = {2, 2, 2, 0, 1};

        int res1 = findMin(nums1);
        int res2 = findMin(nums2);
        System.out.println(res1);
        System.out.println(res2);
    }

}
