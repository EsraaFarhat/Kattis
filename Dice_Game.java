import java.util.Scanner;

public class Dice_Game {

	public static void main(String[] args) {
		int gunnarSum = 0, emmaSum = 0;

		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			int dice = s.nextInt();
			gunnarSum += dice;
		}
		
		for (int i = 0; i < 4; i++) {
			int dice = s.nextInt();
			emmaSum += dice;
		}
		
		if(gunnarSum > emmaSum) System.out.println("Gunnar");
		else if (gunnarSum < emmaSum) System.out.println("Emma");
		else System.out.println("Tie");
	}

}
