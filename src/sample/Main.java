package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello World");
        TTTGui.getInstance().setStage(primaryStage);
        TTTGui.getInstance().init();
        AIManager check = new AIManager();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
