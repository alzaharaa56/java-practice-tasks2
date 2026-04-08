public class Task12 {

    public int[] notAlone(int[] nums) {
for (int i = 1; i < nums.length - 1; i++) {
if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {

if (nums[i - 1] > nums[i + 1]) {
nums[i] = nums[i - 1];
} else {
nums[i] = nums[i + 1];
}
}
}
return nums;
    }
}
