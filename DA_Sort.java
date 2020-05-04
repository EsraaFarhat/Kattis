import java.util.*;

public class DA_Sort {

	public static void main(String[] args) {
		
		//List<Integer> arr1 = new ArrayList<Integer>();
		//List<Integer> arr2 = new ArrayList<Integer>();
		int setNum, arrLength;

		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		for(int i=1;i<=testCases;i++) {
			setNum = s.nextInt();
			arrLength = s.nextInt();
			int[] arr1 = new int[arrLength];
			int[] arr2 = new int[arrLength];
			
			for(int j=0;j<arrLength;j++) {
				arr1[j] = s.nextInt();
				arr2[j] = arr1[j];
			}
			Arrays.sort(arr2);
			int index =0;
			
			for(int j=0;j<arrLength;j++) {
				if(arr1[j] == arr2[index]) {
					index++;
				}
			}
			System.out.println(setNum + " " + (arrLength-index));
		}

	}

}
