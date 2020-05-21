import java.util.*;

public class Transit_Woes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s,t,n;
		s = scanner.nextInt();
		t = scanner.nextInt();
		n = scanner.nextInt();
		int sum=s;
		int[] walkingTime = new int[n+1];
		int[] busTime = new int[n];
		int[] intervals = new int[n];
		for(int i=0;i<n+1;i++) {
			walkingTime[i] = scanner.nextInt();
		}
		for(int i=0;i<n;i++) {
			busTime[i] = scanner.nextInt();
		}
		for(int i=0;i<n;i++) {
			intervals[i] = scanner.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			sum += walkingTime[i];
			if(sum<intervals[i]) sum = intervals[i];
			while(sum>intervals[i]) {
				intervals[i] += intervals[i];
				sum = intervals[i];
			}
			sum += busTime[i];
		}
		
		sum += walkingTime[n];
		
		if(sum <= t) System.out.println("yes");
		else System.out.println("no");

	}

}
