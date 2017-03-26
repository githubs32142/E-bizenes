/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasaz.Controllers;

import com.sun.deploy.config.Platform;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class LocationController implements Initializable {
    WebEngine webEngine;
    @FXML
    private WebView webView;

    public LocationController() {
    }
    
    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        webEngine = webView.getEngine();
        URL urlGoogleMaps = getClass().getResource("/pasaz/Resource/HTML/lokalizacja.html");
        webEngine.load(urlGoogleMaps.toExternalForm());
    }    

    
}
