public class Task11 {
    public int[] post4(int[] nums) {
int a = -1;

for (int i = nums.length - 1; i >= 0; i--) {
if (nums[i] == 4) {
a = i;
break;
}
}
int size = nums.length - (a + 1);
int[] result = new int[size];

for (int j = 0; j < size; j++) {
result[j] = nums[a + 1 + j];
}

return result;
    }
}
