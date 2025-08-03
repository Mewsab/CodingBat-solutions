public class swapEnds {
    public int[] swapEnds(int[] nums) {
        int mod = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = mod;
        return nums;
    }
}
