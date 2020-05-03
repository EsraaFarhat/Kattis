import java.util.*;

public class Reversed_Binary_Numbers {

	public static void main(String[] args) {
		int base = 1, reversedNum = 0;
		List<Integer> binary = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		while(num>1) {
			if(num % 2 == 0) {
				binary.add(0);
			}
			else {
				binary.add(1);
			}
			num = num/2;
		}
		
		binary.add(num);
		
		for(int i=binary.size()-1; i>=0; i--, base*=2) {
			reversedNum += base * binary.get(i);
		}
		
		System.out.println(reversedNum);
	}

}
