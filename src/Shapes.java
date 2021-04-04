import java.util.*;

public class Shapes {

	public String inputShape() {
		// accept user input and returns it
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}

	public void drawShape() {
		// checks what the user entered to output something
		String shape = inputShape();
		int shapes = 3;
		// String shapeString;
		switch (shapes) {
		case 1:
			shape = "circle";
			break;
		default:
			System.out.println("fail");
			break;
		}
		System.out.println(shape);
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to shapes. To start playing, enter a shape: ");
		Shapes s = new Shapes();
		// test input shape
		// System.out.println(s.inputShape());
		// test .drawShape takes correct input and outputs something
		s.drawShape();

	}
}
