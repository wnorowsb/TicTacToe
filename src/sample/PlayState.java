package sample;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.Group;

import javafx.scene.control.Button;

import java.util.Arrays;

public class PlayState {
    Stage stage;
    Group group;
    Grid grid;
    int state=1;
    Rectangle [] rectangles;
    public PlayState(Stage stage){
        this.stage = stage;
        grid = new Grid (3,3);
    }

    public void show(){
        group = new Group();

        rectangles = new Rectangle[grid.getSize()*grid.getSize()];

        for (int i =0; i<grid.getSize(); i++) {
            for (int j = 0; j < grid.getSize(); j++) {
                rectangles[i+grid.getSize()*j] = new Rectangle(i * 100, j * 100, 99, 99);
                System.out.println("i: " + i);
                System.out.println("j: " + j);

                rectangles[i+grid.getSize()*j].setOnMouseClicked(new EventHandler<MouseEvent>() {

                    @Override
                    public void handle(MouseEvent event) {
                        Rectangle rect = (Rectangle) event.getSource();
                        if(state == 1)
                            rect.setFill(Color.GREEN);
                        else
                            rect.setFill(Color.RED);
                        int index =Arrays.asList(rectangles).indexOf(event.getSource());
                        grid.getCells()[index / grid.getSize()][index % grid.getSize()].setState(state);
                        if (state == 1) state = 2;
                        else state = 1;
                        grid.check();
                        System.out.println(index);
                    }
                });
                group.getChildren().add(rectangles[i+grid.getSize()*j]);

            }
        }

        stage.setScene(new Scene (group, 300, 300));
        stage.show();
    }

}
