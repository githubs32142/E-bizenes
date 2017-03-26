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
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

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
    
}
