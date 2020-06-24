package euler;

import java.util.*;

/*
 * sum of all positive integers which cannot be written as sum of abundant numbers
 * https://projecteuler.net/problem=23
 */

public class Problem23_nonAbundantSums {
	public static void main(String[] args) {
		worker1 Bob = new worker1();
		ArrayList<Integer> abundantPool = new ArrayList<Integer>();
		ArrayList<Integer> nonAbundantPool = new ArrayList<Integer>();
		
		for (int i = 1; i <= 28123 ; i++ ) {
			if ( i < Bob.divisorSum(i)) {
				abundantPool.add(i);
			}
			nonAbundantPool.add(i);
		}
		
		for (int i = 0; i < abundantPool.size(); i++) {
			for (int y = i; y < abundantPool.size(); y++) {
				int val = abundantPool.get(i) + abundantPool.get(y);
				nonAbundantPool.remove(val);
			}
		}
		
		int sum = 0;

		for (int value : nonAbundantPool) {
			sum += value;
		}
		
		System.out.print(sum);
	}
}


class worker1{
	
	public int divisorSum(int value) {
		int sum = 0;
		for(int i = 1; i < (value/2)+1; i++) {
			if(value % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}

