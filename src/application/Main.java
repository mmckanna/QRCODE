package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			// top sections
			Rectangle topLeft1 = new Rectangle(10, 10, 150, 150);
			Rectangle topLeft2 = new Rectangle(35, 35, 100, 100);
			Rectangle topLeft3 = new Rectangle(50, 50, 70, 70);
			Rectangle topRight1 = new Rectangle(350, 10, 150, 150);
			Rectangle topRight2 = new Rectangle(375, 35, 100, 100);
			Rectangle topRight3 = new Rectangle(390, 50, 70, 70);
			Rectangle rightColumn = new Rectangle(350, 175, 150, 325);

			topLeft1.setFill(Color.BLACK);
			topLeft2.setFill(Color.WHITE);
			topLeft3.setFill(Color.BLACK);
			topRight1.setFill(Color.BLACK);
			topRight2.setFill(Color.WHITE);
			topRight3.setFill(Color.BLACK);

			rightColumn.setFill(Color.BLACK);

			// middle sections
			Rectangle middleColumn = new Rectangle(180, 10, 150, 490);
			Rectangle middleRow = new Rectangle(10, 175, 490, 160);

			Rectangle topMiddle1 = new Rectangle(265, 10, 40, 95);
			Rectangle topMiddle2 = new Rectangle(225, 10, 40, 75);
			Rectangle topMiddle3 = new Rectangle(180, 40, 25, 40);
			Rectangle topMiddle4 = new Rectangle(200, 110, 40, 20);
			Rectangle topMiddle5 = new Rectangle(180, 130, 150, 30);

			Rectangle middle1 = new Rectangle(10, 195, 300, 20);
			Rectangle middle2 = new Rectangle(330, 195, 20, 20);
			Rectangle middle3 = new Rectangle(370, 195, 50, 20);
			Rectangle middle4 = new Rectangle(330, 205, 50, 20);
			Rectangle middle5 = new Rectangle(370, 205, 100, 75);
			Rectangle middle6 = new Rectangle(10, 205, 40, 40);
			Rectangle middle7 = new Rectangle(10, 245, 20, 20);
			Rectangle middle8 = new Rectangle(10, 260, 20, 20);
			Rectangle middle9 = new Rectangle(10, 315, 20, 20);
			Rectangle middle10 = new Rectangle(60, 315, 100, 20);
			Rectangle middle11 = new Rectangle(80, 265, 20, 70);
			Rectangle middle12 = new Rectangle(120, 265, 20, 70);
			Rectangle middle13 = new Rectangle(80, 245, 60, 20);
			Rectangle middle14 = new Rectangle(140, 245, 20, 80);
			Rectangle middle15 = new Rectangle(180, 245, 20, 20);
			Rectangle middle16 = new Rectangle(220, 245, 20, 20);
			Rectangle middle17 = new Rectangle(260, 245, 20, 20);
			Rectangle middle18 = new Rectangle(300, 245, 70, 20);
			Rectangle middle19 = new Rectangle(150, 245, 20, 40);
			Rectangle middle20 = new Rectangle(190, 285, 20, 40);
			Rectangle middle21 = new Rectangle(190, 285, 20, 40);
			Rectangle middle22 = new Rectangle(230, 285, 20, 40);
			Rectangle middle23 = new Rectangle(270, 285, 20, 120);
			Rectangle middle24 = new Rectangle(310, 285, 20, 40);
			Rectangle middle25 = new Rectangle(350, 285, 20, 40);
			Rectangle middle26 = new Rectangle(390, 275, 20, 200);
			Rectangle middle27 = new Rectangle(430, 275, 20, 200);
			Rectangle middle28 = new Rectangle(470, 285, 20, 40);

			middleColumn.setFill(Color.BLACK);
			middleRow.setFill(Color.BLACK);
			middle1.setFill(Color.WHITE);
			middle2.setFill(Color.WHITE);
			middle3.setFill(Color.WHITE);
			middle4.setFill(Color.WHITE);
			middle5.setFill(Color.WHITE);
			middle6.setFill(Color.WHITE);
			middle7.setFill(Color.WHITE);
			middle8.setFill(Color.WHITE);
			middle9.setFill(Color.WHITE);
			middle10.setFill(Color.WHITE);
			middle11.setFill(Color.BLACK);
			middle12.setFill(Color.BLACK);
			middle13.setFill(Color.WHITE);
			middle14.setFill(Color.WHITE);
			middle15.setFill(Color.WHITE);
			middle16.setFill(Color.WHITE);
			middle17.setFill(Color.WHITE);
			middle18.setFill(Color.WHITE);
			middle20.setFill(Color.WHITE);
			middle21.setFill(Color.WHITE);
			middle22.setFill(Color.WHITE);
			middle23.setFill(Color.WHITE);
			middle24.setFill(Color.WHITE);
			middle25.setFill(Color.WHITE);
			middle26.setFill(Color.WHITE);
			middle27.setFill(Color.WHITE);
			middle28.setFill(Color.WHITE);

			topMiddle1.setFill(Color.WHITE);
			topMiddle2.setFill(Color.WHITE);
			topMiddle3.setFill(Color.WHITE);
			topMiddle4.setFill(Color.WHITE);
			topMiddle5.setFill(Color.WHITE);

			// bottom sections
			Rectangle bottomLeft1 = new Rectangle(10, 350, 150, 150);
			Rectangle bottomLeft2 = new Rectangle(35, 375, 100, 100);
			Rectangle bottomLeft3 = new Rectangle(50, 390, 70, 70);
			Rectangle bottom1 = new Rectangle(180, 350, 40, 130);
			Rectangle bottom2 = new Rectangle(200, 350, 290, 20);
			Rectangle bottom3 = new Rectangle(200, 390, 290, 20);
			Rectangle bottom4 = new Rectangle(200, 430, 290, 20);

			bottomLeft1.setFill(Color.BLACK);
			bottomLeft2.setFill(Color.WHITE);
			bottomLeft3.setFill(Color.BLACK);
			bottom1.setFill(Color.WHITE);
			bottom2.setFill(Color.WHITE);
			bottom3.setFill(Color.WHITE);
			bottom4.setFill(Color.WHITE);

			Group root = new Group(topLeft1, topLeft2, topLeft3, topRight1, topRight2, topRight3, middleColumn,
					middleRow, rightColumn, topMiddle1, topMiddle2, topMiddle3, topMiddle4, topMiddle5, middle1,
					middle2, middle3, middle4, middle5, middle6, middle7, middle8, middle9, middle10, middle11,
					middle12, middle13, middle14, middle15, middle16, middle17, middle18, middle19, middle20, middle21,
					middle22, middle23, middle24, middle25, middle26, middle27, middle28, bottom1, bottom2, bottom3,
					bottom4, bottomLeft1, bottomLeft2, bottomLeft3);

			Scene scene = new Scene(root, 512, 512, Color.WHITE);

			primaryStage.setTitle("QR CODE");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
