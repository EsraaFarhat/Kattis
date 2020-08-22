import java.util.*;

public class Planina {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int[] numOfPoints = new int[16];
		numOfPoints[0] = 4;
		int x = 2;
		for(int i=1; i<16; i++) {
			x = (x*2) - 1;
			numOfPoints[i] = x * x;
		}
		
		System.out.println(numOfPoints[S.nextInt()]);
	}
}
