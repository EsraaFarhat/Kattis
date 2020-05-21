import java.util.*;

public class Tarifa {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int X = s.nextInt();
		int months = s.nextInt();
		int sum = X;
		for(int i=0;i<months;i++) {
			sum -= s.nextInt();
			sum += X;
		}
		System.out.println(sum);
	}

}
