import java.util.*;

public class QualityAdjustedLifeYear {

	public static void main(String[] args) {

		int periodsNumber;
		double quality, yearsNumber, QALY = 0.0;
		
		Scanner s = new Scanner(System.in);
		periodsNumber = s.nextInt();
		
		for(int i=0;i<periodsNumber;i++) {
			quality = s.nextDouble();
			yearsNumber = s.nextDouble();
			QALY += (quality * yearsNumber); 
		}
		
		System.out.println(QALY);
	}

}
