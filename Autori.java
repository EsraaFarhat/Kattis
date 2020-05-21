import java.util.*;

public class Autori {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		for(int i=0;i<name.length();i++) {
			if(Character.isUpperCase(name.charAt(i))) {
				System.out.print(name.charAt(i));
			}
		}
	}

}
