package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Circle circle1 = new Circle(100, 100, 10);
        circle1.setFill(Color.GOLD);

        Circle circle2 = new Circle(100, 100, 10);
        //circle2.setFill(Color.GREEN);

        Group group = new Group(circle1);

        //Button
        Button buttonGreenCircle = new Button("green circle");
        Button buttonGoldCircle = new Button("Gold circle");

        //Container for the buttons
        HBox buttonContainer = new HBox(8);
        buttonContainer.setAlignment(Pos.CENTER);
        buttonContainer.getChildren().addAll(buttonGoldCircle, buttonGreenCircle);

        //container for the Hbox and circle
        VBox root = new VBox(10);
        root.getChildren().addAll(buttonContainer, group);
        root.setAlignment(Pos.CENTER);

        //Scene
        Scene scene = new Scene(root, 200, 200);
        scene.setFill(Color.BLACK);

        //mouse clicking actions
        buttonGoldCircle.setOnAction(e -> circle1.setFill(Color.GREEN));

        //creat a stage
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
