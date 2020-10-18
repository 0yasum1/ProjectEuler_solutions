

/*
 * sum of the digits in the factorial of 100
 * https://projecteuler.net/problem=20
 */

public class Problem20_factorialDigitSum {
	public static void main(String[] args) {
		worker bob = new worker();
		for(int i = 3; i < 2540160 ;i++) {
			String temp = Integer.toString(i);
			int sum = 0;
			for (int j = 0; j < temp.length(); j++)
			{
			    sum += bob.factorial(Integer.parseInt(String.valueOf(temp.charAt(j))));
			}
			if ( i == sum ) {
				System.out.print(i + "\n");
			}
		}
		
//		for ( int i = 1; i < 100; i ++) {
//			System.out.print(i + "\n" + i* bob.factorial(9) + "\n");
//		}
		// 9999999 - 2540160
		
		
	}
}

class worker{
	public int factorial(int value) {
		int sum = 1;
		while(value > 0) {
			sum *= value;
			value--;
		}
		return sum;
	}
}
