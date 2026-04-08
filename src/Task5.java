public class Task5 {
    public boolean no14(int[] nums) {
boolean a1 = false;
boolean b1 = false;

for (int i = 0; i < nums.length; i++) {
if (nums[i] == 1) {
a1 = true;
}
if (nums[i] == 4) {
b1 = true;
}
}

if (a1 && b1) {
return false;
} else {
return true;
}
    }
}
