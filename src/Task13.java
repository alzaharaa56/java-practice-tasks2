public class Task13 {
    public int[] zeroFront(int[] nums) {
int[] result = new int[nums.length];
int left = 0;
int right = nums.length - 1;

for (int i = 0; i < nums.length; i++) {
if (nums[i] == 0) {
result[left] = 0;
left++;
} else {
result[right] = nums[i];
right--;
}
}
return result;
    }
}
