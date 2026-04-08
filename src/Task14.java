public class Task14 {
    public int[] withoutTen(int[] nums) {
int[] result = new int[nums.length];
int position = 0;

for (int i = 0; i < nums.length; i++) {

if (nums[i] != 10) {
result[position] = nums[i];
position++;
}
}
return result;
    }
}
