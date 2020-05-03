import java.util.*;

public class Skener {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int R, C, Zr, Zc,i, j=0, k=0, Ccount=0, Rcount=0;
		char temp;
		String str = new String();
		R = s.nextInt();
		C = s.nextInt();
		Zr = s.nextInt();
		Zc = s.nextInt();
		
		char[][] original = new char[R][C];
		char[][] edited = new char[R * Zr][C * Zc];
		
		for(i=0;i<R;i++) {
			str = s.next();
			for(j=0;j<C;j++) {
				temp = str.charAt(j);
				original[i][j] = temp;
				// Copying every column Zc times
				for(k = j*Zc; Ccount<Zc; k++,Ccount++) {
					edited[i*Zr][k] = temp;
				}
				Ccount=0;
			}
			// Copying every row Zr times
			for(k=i*Zr+1;Rcount<Zr-1;k++,Rcount++) {
				for(int l=0;l<C*Zc;l++) {
					edited[k][l] = edited[i*Zr][l];
				}		
			}
			Rcount=0;
		}
		
		for(i=0;i<R*Zr;i++) {
			for(j=0;j<C*Zc;j++) {
				System.out.print(edited[i][j]);
			}
			System.out.println();
		}
		

	}

}
