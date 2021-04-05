import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

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

		// create a text field for shape
		TextField shapeField = new TextField();
		shapeField.setMaxWidth(200);

		// add a label so user knows what is going on
		Label shapeLabel = new Label("Enter your shape");

		// add a button to submit shape
		Button shapeButton = new Button();

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
