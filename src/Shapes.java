import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Shapes extends Application {

	public String inputShape() {
		// accept user input and returns it
		System.out.println("Welcome to shapes. To start playing, enter a shape: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}

	@Override
	public void start(Stage stage) {
		// create and configure the stage to create a circle
		String shape = inputShape();
		if (shape.equals("circle")) {
			Circle circle = new Circle(40, 40, 30);
			Group root = new Group(circle);
			Scene scene = new Scene(root, 400, 300);

			stage.setTitle("Your shape");
			stage.setScene(scene);
			stage.show();

		} else {
			System.out.println("That is an invalid shape");
		}
	}

	public static void main(String[] args) throws Exception {

		// Shapes s = new Shapes();
		// test input shape
		// test .drawShape takes correct input and outputs something
		// we know .inputShape() works because .drawShape uses it
		// s.checkInput();
		launch(args);

	}
}
