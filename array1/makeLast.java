public class makeLast {
    public int[] makeLast(int[] nums) {
        int[] nums2= new int[nums.length * 2];

        if (nums.length >= 1) {
            nums2[nums2.length - 1] = nums[nums.length - 1];
            return nums2;
        }
        return nums2;
    }
}

