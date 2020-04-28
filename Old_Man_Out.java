import java.util.*;

public class Old_Man_Out {

	public static void main(String[] args) {
		
		int testCases, guests;
		
		Scanner s = new Scanner(System.in);
		testCases = s.nextInt();
		
		for(int i=1; i<=testCases; i++) {
			guests = s.nextInt();
			List<String> invitationCode = new ArrayList<String>();
			
			for(int j=0; j<guests; j++) {
				String code = s.next();
				if(invitationCode.contains(code))
				{
					invitationCode.remove(code);
				}
				else
				invitationCode.add(code);
			}
			System.out.println("Case #" + i + ": " +
			                   invitationCode.get(0));
		}

		
	}

}
