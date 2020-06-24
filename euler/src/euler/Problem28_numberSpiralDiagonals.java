package euler;

import java.util.Scanner;

/*
 * spiral of numbers
 * https://projecteuler.net/problem=28
 */

public class Problem28_numberSpiralDiagonals {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		spiralFunction(in.nextInt());
		in.close();
	}
	
	static void spiralFunction(int userInput) {
		int[][] box = new int[(int)Math.sqrt((Double.valueOf(userInput)))+1][(int)Math.sqrt((Double.valueOf(userInput)))+1];
		int row = (int)Math.sqrt((Double.valueOf(userInput)))/2;
		int column = (int)Math.sqrt((Double.valueOf(userInput)))/2;
		int steps = 1;
		int counter = 1;
		
		char direction = 'r';
		
		while(counter < userInput) {
			box[row][column] = counter;
			
			switch(direction) {
			case 'r':
				for(int i = 0; i < steps; i++) {
					column = column + 1;
					counter++;
					box[row][column] = counter;
					System.out.print("d:" + direction + " r: " + row + "c: " + column + "steps: " + steps + "counter: " + counter + "\n");
				}
				direction = 'd';
				break;
			case 'd':
				for(int i = 0; i < steps; i++) {
					row = row +1;
					counter++;
					box[row][column] = counter;
					System.out.print("d:" + direction + " r: " + row + "c: " + column + "steps: " + steps + "counter: " + counter + "\n");

				}
				direction = 'l';
				steps = steps +1;
				break;
			case 'l':
				for(int i = 0; i < steps; i++) {
					column = column -1;
					counter++;
					box[row][column] = counter;
					System.out.print("d:" + direction + " r: " + row + "c: " + column + "steps: " + steps + "counter: " + counter + "\n");
				}
				direction = 'u';
				break;
			case 'u':
				for(int i = 0; i < steps; i++) {
					row = row -1;
					counter++;
					box[row][column] = counter;
					System.out.print("d:" + direction + " r: " + row + "c: " + column + "steps: " + steps + "counter: " + counter + "\n");
				}
				direction = 'r';
				steps = steps +1;
				break;
			}
		}
		
		for(int i = 0; i < (int)Math.sqrt((Double.valueOf(userInput)))+1; i++)
		   {
		      for(int j = 0; j < (int)Math.sqrt((Double.valueOf(userInput)))+1; j++)
		      {
		         System.out.printf("%5d ", box[i][j]);
		      }
		      System.out.println();
		   }
		
	}

}
