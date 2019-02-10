package sample;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;

import javafx.scene.control.Button;

public class TTTGui {

    private static TTTGui instance = new TTTGui();
    PlayState playState;
    MenuState menuState;
    Stage stage;

    public static TTTGui getInstance(){
        return instance;
    }

    public void init(){
        playState = new PlayState(stage);
        menuState = new MenuState(stage);
        showMenu();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void showGame(){
        playState.show();
    }

    public void showMenu(){
        menuState.show();
    }
}
