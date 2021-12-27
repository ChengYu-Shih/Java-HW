import java.util.Scanner;

public class JPA02 {

	public static void main(String[] args) {
		System.out.println("Please enter score:");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();

		if (b >= 60) {
			System.out.println("You pass");
		} else {
			System.out.println("End");
		}

	}

}
