import java.util.*;
import javafx.application.Application;

public class Shapes extends Application {

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
		// test .drawShape takes correct input and outputs something
		// we know .inputShape() works because .drawShape uses it
		s.drawShape();

	}
}
