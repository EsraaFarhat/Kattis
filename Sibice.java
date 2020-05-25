import java.util.*;

public class Sibice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int w = s.nextInt();
		int h = s.nextInt();
		double maxLength = Math.sqrt(w*w + h*h);
		
		for(int i=0; i<n; i++) {
			if(s.nextInt() > maxLength)
				System.out.println("NE");
			else
				System.out.println("DA");
		}

	}

}
