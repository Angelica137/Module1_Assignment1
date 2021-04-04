import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
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
		// inputShape();

		String shape = inputShape();
		if (shape.equals("circle")) {
			Circle circle = new Circle(40, 40, 30);
			Group root = new Group(circle);
			Scene scene = new Scene(root, 400, 300);

			stage.setTitle("Your shape");
			stage.setScene(scene);
			stage.show();

		} else if (shape.equals("rectangle")) {
			Rectangle rectangle = new Rectangle(200, 100);
			Group root = new Group(rectangle);
			Scene scene = new Scene(root, 400, 300);

			stage.setTitle("Your shape");
			stage.setScene(scene);
			stage.show();

		} else if (shape.equals("octagon")) {
			Polygon octagon = new Polygon();
			octagon.getPoints().addAll(new Double[] { 250.0, 50.0, 350.0, 50.0, 400.0, 100.0, 400.0, 200.0, 350.0, 250.0,
					250.0, 250.0, 200.0, 200.0, 200.0, 100.0 });
			Group root = new Group(octagon);
			Scene scene = new Scene(root, 600, 600);

			stage.setTitle("Your shape");
			stage.setScene(scene);
			stage.show();

		} else {
			System.out.println("That is an invalid shape");
		}
	}

	public static void main(String[] args) {

		launch(args);

	}
}
