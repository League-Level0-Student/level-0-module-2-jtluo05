import java.util.Random;

public class RandomCheckpoint {
	public static void main(String[] args) {
		Random number = new Random();
		int num = number.nextInt(1000);
		int number1 = number.nextInt(900);
		int number2 = num + number1;
		int number3 = num - number1;
		System.out.println(num + " + " + number1 + " = " + number2);
		System.out.println(num + " - " + number1 + " = " + number3);

	}
}
