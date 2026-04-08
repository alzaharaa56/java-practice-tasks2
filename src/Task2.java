public class Task2 {
    public static int sum13(int[] nums) {
int sum = 0;

for (int i = 0; i < nums.length; i++) {

if (nums[i] == 13) {
i++;
continue;
}



sum = sum + nums[i];
}

return sum;
}
}

