package stopsign;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import java.awt.*;

public class ShowPolygon extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
// Create a scene and place it in the stage
// StackPane stackPane = new StackPane();
		// Polygon MyPolygon = new Polygon();
//stackPane.getChildren().add(MyPolygon);
//primaryStage.setTitle("ShowPolygon"); // Set the stage title
//primaryStage.setScene(scene); // Place the scene in the stage
//primaryStage.show(); // Display the stage
		// class MyPolygon extends StackPane {
		// public void paint() {
		// Create a polygon and place polygon to pane

		StackPane stackPane = new StackPane();
		Polygon MyPolygon = new Polygon();
		stackPane.getChildren().add(MyPolygon);
		MyPolygon.setFill(Color.RED);
		MyPolygon.setStroke(Color.WHITE);
		MyPolygon.setRotate(22.5);

		ObservableList<Double> list = MyPolygon.getPoints();
		final double Width = 400, Height = 400;
		double centerX = Width / 2, centerY = Height / 2;
		double radius = Math.min(Width, Height) * 0.4;

		for (int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
		}
		Text text = new Text("STOP");
		text.setFont(Font.font("Times new Roman", 100));
		text.setFill(Color.WHITE);
		stackPane.getChildren().add(text);

		Scene scene = new Scene(stackPane, Width, Height);
		primaryStage.setTitle("ShowPolygon");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
