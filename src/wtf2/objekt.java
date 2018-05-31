package wtf2;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class objekt extends Application {

	public static final double WINDOW_WIDTH = 500;
	public static final double WINDOW_HEIGHT = 500;

	

	public static void main(String[] args) {
		launch();
	}

	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		
		Scene scene = new Scene(root, 500, 500, Color.WHITE);
		
		Rectangle card = new Rectangle(150,200);

		Polygon tri = new Polygon(
				40,0,
				0,80,
				80,80
				);
		tri.setTranslateX(35);
		tri.setTranslateY(60);
		tri.setFill(Color.RED);
		card.setFill(Color.WHITE);
		card.setStroke(Color.BLACK);
		
		root.getChildren().addAll(card, tri);
		
		
		root.setTranslateY(WINDOW_WIDTH/2);
		root.setTranslateX(WINDOW_HEIGHT/2);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}