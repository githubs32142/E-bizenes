/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasaz.Controllers;

import herudi.animations.FadeInLeftTransition1;
import herudi.animations.FadeInRightTransition;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class LogowanieController implements Initializable {
    
    @FXML
    private Button logIn;
    @FXML
    private TextField loginText;
    @FXML
    private PasswordField passwordText;
    @FXML
    private Button close;
    @FXML
    private Label close2;

    /**
     * Initializes the controller class.
     */
    


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Platform.runLater(() -> {
            
            new FadeInLeftTransition1(loginText).play();
            new FadeInLeftTransition1(passwordText).play();
            new FadeInRightTransition(logIn).play();
            new FadeInRightTransition(close).play();
            close2.setOnMouseClicked((MouseEvent event) -> {
                Platform.exit();
                System.exit(0);
            });
        });
    }    

    @FXML
    private void LogIn(ActionEvent event) {
         try{
                FXMLLoader load = new FXMLLoader(this.getClass().getResource("/pasaz/FXML/ShopWindow.fxml")); 
                Parent parent= load.load();
                Scene scene = new Scene(parent);
                Stage primaryStage = new Stage();
                primaryStage.setScene(scene);          
                //primaryStage.initStyle(StageStyle.UNDECORATED);
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage;
                stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
                stage.close();
            }
            catch(Exception e){
                 Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
    }

    @FXML
    private void back(ActionEvent event) {
        try{
                FXMLLoader load = new FXMLLoader(this.getClass().getResource("/pasaz/FXML/MainWindow.fxml")); 
                Parent parent= load.load();
                Scene scene = new Scene(parent);
                Stage primaryStage = new Stage();
                primaryStage.setScene(scene);          
                //primaryStage.initStyle(StageStyle.UNDECORATED);
                primaryStage.setResizable(false);
                primaryStage.show();
                Stage stage;
                stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
                stage.close();
            }
            catch(Exception e){
                 Logger logger = Logger.getLogger(getClass().getName());
                logger.log(Level.SEVERE, "Failed to create new Window.", e);
            }
    }
    
}
