import java.util.*;

public class Pot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		long sum=0;
		for(int i=0;i<N;i++) {
			int P = s.nextInt();
			int rem = P % 10;
			int res = P / 10;
			sum += Math.pow(res, rem);
		}
		
		System.out.println(sum);
	}

}
