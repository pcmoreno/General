package wordguesser;

import java.util.ArrayList;
import java.util.Random;

public class Randomer {

	private String[] ppl;
	private Random rand;
	private ArrayList<String> order;

	public Randomer() {
		order = new ArrayList<String>();
		rand = new Random();
	}

	public static void main(String[] args) {
		Randomer R = new Randomer();
		R.run();
	}

	private void initialize() {
		ppl = new String[] { "Henok", "Lies", "Paulo", "David", "Thijs", "Jonathan", "Martijn", "Nathan", "Annemieke", "Sinan", "Janneke", "Bram", "Phil" };
	}

	private void run() {
		initialize();

		int randomNumber;
		int x = (ppl.length);
		while (x > 0) {
			randomNumber = rand.nextInt(ppl.length);
			String temp = ppl[randomNumber];
			if (!order.contains(temp)) {
				order.add(temp);
				x--;
			}
		}
		int counter = 0;
		for (String y : order) {
			counter++;
			System.out.println(counter + " - " + y);
		}
	}

}
