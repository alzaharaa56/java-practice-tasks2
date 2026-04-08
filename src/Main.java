//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main program = new Main();
        int[] exampleArray = {2, 1, 2, 3, 4};

        System.out.println("the number of digits is even" + "  "+ program.countEvens(exampleArray));
    }

    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;

            }
        }
        return count;


    }
}