package wtf2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class different_scenes extends Application {

	private static final double RANDOM = 0;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene = uppgift5();

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public Scene uppgift1() {

		double WIDTH = 500;
		double HEIGHT = 500;
		
		Group root = new Group();
		
		Circle r = new Circle(50);

		r.setTranslateY(WIDTH/2 - r.getRadius()/2);
		r.setTranslateX(WIDTH/2 - r.getRadius()/2);
		
		
		r.setFill(Color.RED);
		root.getChildren().add(r);
		
		
		Scene scene = new Scene(root, WIDTH, HEIGHT);

		return scene;
	}

	public Scene uppgift2() {

		double WIDTH = 500;
		double HEIGHT = 500;
		
		Group root = new Group();
		
		
		for (int i = 0; i < 50; i++) {
			
			Circle cir = new Circle(10);
			
	cir.setTranslateX(Math.random()*WIDTH);
	cir.setTranslateY(Math.random()*HEIGHT);
			
			root.getChildren().add(cir);
			cir.setFill(Color.BLACK);
		}
		
		Scene scene = new Scene(root, WIDTH, HEIGHT);

		return scene;
	}

	public Scene uppgift3() {

		double WIDTH = 500;
		double HEIGHT = 500;
		
		Rectangle re1 = new Rectangle (100, 100);
		Rectangle re2 = new Rectangle (100, 100);
		Rectangle re3 = new Rectangle (100, 100);
		Rectangle re4 = new Rectangle (100, 100);
		Group root = new Group();
		
		root.getChildren().add(re1);
		root.getChildren().add(re2);
		root.getChildren().add(re3);
		root.getChildren().add(re4);
		
		re1.setFill(Color.BLACK);
		re2.setFill(Color.BLUE);
		re3.setFill(Color.RED);
		re4.setFill(Color.YELLOW);
		
		re1.setTranslateY(HEIGHT - 100);
	    re1.setTranslateX(WIDTH - 100);
		
		re2.setTranslateY(HEIGHT - 100);
	    
		
	    re3.setTranslateX(WIDTH - 100);
		Scene scene = new Scene(root, WIDTH, HEIGHT);

		return scene;
	}
	
	public Scene uppgift4() {
		double WIDTH = 1000;
		double HEIGHT = 500;
		
		Group root = new Group();
		
		Scene scene = new Scene(root, WIDTH, HEIGHT);
		
		Rectangle rec1 = new Rectangle (1000, 500);
		Rectangle rec2 = new Rectangle (200, 200);
		Rectangle rec3 = new Rectangle (700, 200);
		Rectangle rec4 = new Rectangle (200, 200);
		Rectangle rec5 = new Rectangle (700, 200);
		
		
		root.getChildren().add(rec1);
		root.getChildren().add(rec2);
		root.getChildren().add(rec3);
		root.getChildren().add(rec4);
		root.getChildren().add(rec5);
		
		rec1.setFill(Color.YELLOW);
		rec2.setFill(Color.BLUE);
		rec3.setFill(Color.BLUE);
		rec4.setFill(Color.BLUE);
		rec5.setFill(Color.BLUE);
		
		
		rec4.setTranslateY(HEIGHT - 200);
		
		rec3.setTranslateX(WIDTH - 700);
		
		rec5.setTranslateX(WIDTH - 700);
		rec5.setTranslateY(HEIGHT - 200);
		
		
		return scene;
		
		
	}
	
	public Scene uppgift5() {
		double WIDTH = 500;
		double HEIGHT = 500;
		
		Group root = new Group();
		
		Scene scene = new Scene(root, WIDTH, HEIGHT);
		
		Rectangle rec = new Rectangle (50, 50);
		rec.setFill(Color.RED);
		
		scene.setOnKeyPressed(event -> {

			KeyCode key = event.getCode();

			switch (key) {

			case W:
				rec.setTranslateY(rec.getTranslateY() - 5);
				break;
			case S:
				rec.setTranslateY(rec.getTranslateY() + 5);
				break;

			case A:
				rec.setTranslateX(rec.getTranslateX() - 5);
				break;
			case D:
				rec.setTranslateX(rec.getTranslateX() + 5);
				break;

			}

		});
		

		return scene;
		
		
	}

}