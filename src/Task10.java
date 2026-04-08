public class Task10 {
    public int[] pre4(int[] nums) {
int count = 0;
for (int i = 0; i < nums.length; i++) {
if (nums[i] == 4) {
count = i;
break;
}
}
int[] result = new int[count];

for (int j = 0; j < count; j++) {
result[j] = nums[j];
}

return result;
    }
}
