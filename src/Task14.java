public class Task14 {
    public static int sum67(int[] nums) {
int sum = 0;
boolean stopAdding = false;

for (int i = 0; i < nums.length; i++) {
if (nums[i] == 6) {
stopAdding = true;
}

if (!stopAdding) {
sum += nums[i];
}

if (nums[i] == 7 && stopAdding) {
stopAdding = false;
}
}

return sum;
}
}
