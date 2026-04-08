//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Main program = new Main();
        //int[] exampleArray = {2, 1, 2, 3, 4};

        //  System.out.println("the number of digits is even" + "  "+ program.countEvens(exampleArray));


     //   Task2 exercises = new Task2();

      //  int[] myNumbers = {1, 2, 13, 2, 1, 13};
       // int result = exercises.sum13(myNumbers);

       // System.out.println("Input [1, 2, 13, 2, 1, 13]");
      //  System.out.println("Expected Sum: 4");
       // System.out.println("Result: " + result);

      //  Task3 exercises = new Task3();
        //int[] luckyArr = {0, 2, 4};
        //int[] unluckyArr = {1, 2, 3};
       // System.out.println("Input [0, 2, 4]: " +exercises.lucky13(luckyArr));
       // System.out.println("Input [1, 2, 3]: " + exercises.lucky13(unluckyArr));


       // Task4 exercises = new Task4();
      //   int n = 4;
        // int[] result = exercises.fizzArray(n);

      //System.out.print("Result for n=4:");
      //for (int i = 0; i < result.length; i++) {
    //System.out.print(result[i] + (i < result.length - 1 ? ", " : ""));


     //  Task5 exercises= new Task5();
        //int[] a = {1, 2, 3};
        //int[] b = {2, 3, 4};
       // int[] c = {1, 2, 4};

       // System.out.println("Case [1, 2, 3]: " + exercises.no14(a));
        //System.out.println("Case [2, 3, 4]: " + exercises.no14(b));
       // System.out.println("Case [1, 2, 4]: " + exercises.no14(c));

        Task6 exercises =new Task6();
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 10};
        System.out.println("Arrays: [1, 2, 3] & [2, 3, 10]");
        System.out.println("Result: " + exercises.matchUp(a, b));







}







    public static int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;

            }
        }
        return count;


    }
}



