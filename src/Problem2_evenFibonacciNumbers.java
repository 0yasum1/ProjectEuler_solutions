import java.util.ArrayList;

/*
 * sum of even-valued terms in the fibonacci sequence below 4million
 * https://projecteuler.net/problem=2
 */

public class Problem2_evenFibonacciNumbers {
    public static void main(String[] args) {
        // timer
        long startTime = System.nanoTime();

        ArrayList<Integer> amicables = new ArrayList<>();
        problem21 worker = new problem21();
        for (int i = 1; i <= 10000; i++) {
            int p = worker.amicableNumbers(i);
            int b = worker.amicableNumbers(p);
            if(b == i && i != p) {
                amicables.add(i);
                amicables.add(p);
            }
        }

        for(int num: amicables) System.out.print(num + "\n");

        int sum = 0;
        for(int num: amicables) sum += num;

        System.out.println(sum);

        // timer end
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);
    }
}

class problem21{
    public int amicableNumbers(int value) {
        int sum = 0;
        for (int i = 1; i <= value/2; i++) {
            if (value % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

