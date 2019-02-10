package sample;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.layout.*;
public class MenuState {
    Stage stage;
    VBox layout;
    public MenuState (Stage stage){
        this.stage = stage;

        //stage.setScene(new Scene (layout, 300, 300));
    }

    public void show(){

        Button playButton = new Button("Play");
        layout = new VBox(10);
        layout.getChildren().add(playButton);
        playButton.setOnAction(e -> {TTTGui.getInstance().showGame();});

        stage.setScene(new Scene (layout, 300, 300));
        stage.show();
    }

}
