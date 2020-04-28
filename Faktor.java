import java.util.Scanner;

public class Faktor {

	public static void main(String[] args) {
		
		double temp, result;

		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int I = s.nextInt();

		result = A * I;
		temp = result - 1;
		double x =  temp/A;
		while( Math.ceil(x) == I) {
			result = temp;
			temp--;
			x = temp/A;
		}
		
		System.out.println((int)result);
	}

}