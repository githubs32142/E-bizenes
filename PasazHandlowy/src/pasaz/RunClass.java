/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasaz;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Admin
 */
public class RunClass extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        HBox pane= FXMLLoader.load(this.getClass().getResource("/pasaz/FXML/MainWindow.fxml"));
        Scene scene= new Scene(pane,1024,700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World!");
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
