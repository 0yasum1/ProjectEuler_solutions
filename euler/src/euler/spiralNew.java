package euler;

public class spiralNew {
	public static void main(String[] args) {
		spiralFunction();
	}
	
	static void spiralFunction() {
		//print numbers from 1 to 25 in a clockwise expanding spiral from center
		// as long as i +1 is smaller than j - i
		// 10 + i
		// 21 - i
		int[][] box = new int[5][5];
		int row = 2;
		int column = 2;
		int steps = 1;
		int counter = 1;
		
		char direction = 'r';
		

		
		while(counter < 25) {
			box[row][column] = counter;
			
			for(int i = 0; i < steps; i++) {
				column = column + 1;
				counter++;
				box[row][column] = counter;
				System.out.print("d:" + direction + " r: " + row + "c: " + column + "steps: " + steps + "counter: " + counter + "\n");
			}
		}

		
		for(int i = 0; i < 5; i++){
		      for(int j = 0; j < 5; j++)
		      {
		         System.out.printf("%5d ", box[i][j]);
		      }
		      System.out.println();
		   }
		
	}

}