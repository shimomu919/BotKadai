import java.util.Random;

public class Computer {
	public static int decidesComputerHand() {
		int hand = new Random().nextInt(3) + 1;

		return hand;
	}
}
