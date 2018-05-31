package wtf2;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class space extends Application {

	public static final double WINDOW_WIDTH = 500;
	public static final double WINDOW_HEIGHT = 300;

	public static void main(String[] args) {
		launch();
	}

	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		
		Scene scene = new Scene(root, 500, 500, Color.BLACK);
		
		
		for (int i = 0; i < 100; i++) {
			
			Circle star = new Circle(Math.random()*4);
			star.setFill(Color.YELLOW);
			star.setTranslateX(Math.random() * 500);
			star.setTranslateY(Math.random() * 500);
			
			
			root.getChildren().add(star);
		}
		
		Circle planet = new Circle(Math.random() * 15 + 15);
		planet.setFill(Color.PURPLE);
		planet.setTranslateX(Math.random() * 500);
		planet.setTranslateY(Math.random() * 500);
		
		root.getChildren().add(planet);
		
		
		Group rocket = new Group();
		
		Polygon top = new Polygon(
				25,0,
				15,20,
				35,20
				);

		Rectangle body = new Rectangle(15,20,20,80);
		
		
		Polygon wings = new Polygon(
				0,100,
				50,100,
				25,50
				);

		top.setFill(Color.RED);
		body.setFill(Color.WHITE);
		wings.setFill(Color.RED);
	
		root.getChildren().addAll(top,wings,body);
		

				
			
			
			
			
			
		
		


		
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}