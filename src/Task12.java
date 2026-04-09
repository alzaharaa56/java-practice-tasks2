public class Task12 {

    public static String[] fizzBuzz(int start, int end) {

        int size = end - start;
        String[] result = new String[size];

        for (int i = 0; i < size; i++) {
            int currentNumber = start + i;


            if (currentNumber % 15 == 0) {
                result[i] = "FizzBuzz";
            } else if (currentNumber % 3 == 0) {
                result[i] = "Fizz";
            } else if (currentNumber % 5 == 0) {
                result[i] = "Buzz";
            } else {
                result[i] = String.valueOf(currentNumber);
            }
        }
        return result;
    }
}
