public class midThree {
    public int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        int[] newNums = {nums[mid - 1], nums[mid], nums[mid + 1]};
        return newNums;
    }
}
