import java.util.*;

public class Piece_of_Cake {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int h = s.nextInt();
		int v = s.nextInt();
		int mx = h*v;
		int a1, a2, a3;
		
		a1 = (n-v) * h;
		a2 = (n-h) * v;
		a3 = (n-h) * (n-v);
		
		if(a1 > mx) mx = a1;
		if(a2 > mx) mx = a2;
		if(a3 > mx) mx = a3;
		
		System.out.println(mx*4);

	}

}
