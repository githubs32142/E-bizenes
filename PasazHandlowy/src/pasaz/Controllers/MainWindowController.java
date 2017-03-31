/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasaz.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class MainWindowController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LogIn(ActionEvent event) {
    }

    @FXML
    private void locationAction(ActionEvent event) {
        Parent root;
        try {
            FXMLLoader load=  new FXMLLoader(getClass().getResource("/pasaz/FXML/Location.fxml"));
            root=load.load();

            Stage stage = new Stage();
            stage.setTitle("Pasaż handlowy");
            stage.setScene(new Scene(root, 900, 550));
            stage.setResizable(false);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    
    }

    @FXML
    private void pozycjaClick(MouseEvent event) {
                Parent root;
        try {
            FXMLLoader load=  new FXMLLoader(getClass().getResource("/pasaz/FXML/Location.fxml"));
            root=load.load();

            Stage stage = new Stage();
            stage.setTitle("Pasaż handlowy");
            stage.setScene(new Scene(root, 900, 550));
            stage.setResizable(false);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void exit(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void exit(MouseEvent event) {
        Platform.exit();
    }
    
}
