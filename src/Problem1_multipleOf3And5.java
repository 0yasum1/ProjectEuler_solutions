

/*
 * all natural numbers below 1000 that are multiples of 3 or 5
 * https://projecteuler.net/problem=1
 */

public class Problem1_multipleOf3And5 {
	
	static int sum;
	
	public static void main(String[] args) {
		
		for ( int i = 0; i < 1000; i++) {
			if ( i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
