import java.util.*;

public class Shapes {

	public String inputShape() {
		// accept user input and returns it
		Scanner sc = new Scanner(System.in);
		String shape = sc.nextLine();
		return shape;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to shapes. To start playing, enter a shape: ");
		Shapes s = new Shapes();
		// s.inputShape();
		System.out.println(s.inputShape());
	}
}
