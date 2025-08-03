public class makeEnds {
    public int[] makeEnds(int[] nums) {
        int[] nums2 = new int[2];

        if (nums.length >= 1){
            nums2[0] =nums[0];
            nums2[1] = nums[nums.length-1];
        }
        return nums2;
    }
}
