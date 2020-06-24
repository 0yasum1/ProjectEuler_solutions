package projectEuler;
import static java.lang.System.out;

public class multiples3and5 {
	static int sum;
	
	multiples3and5(){
	}
	
	public static void main() {
		
		for ( int i = 0; i < 1000; i++) {
			if ( i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
