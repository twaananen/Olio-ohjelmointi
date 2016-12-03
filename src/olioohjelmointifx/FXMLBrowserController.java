/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olioohjelmointifx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author tommi
 */
public class FXMLBrowserController implements Initializable {

    @FXML
    private TextField addressField;
    @FXML
    private WebView web;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void addressFieldAction(ActionEvent event) {
        if (addressField.getText().equals("index.html"))
        {
            web.getEngine().load(getClass().getResource("index.html").toExternalForm());
        }
        else web.getEngine().load("http://"+addressField.getText());
    }

    @FXML
    private void refreshAction(ActionEvent event) {
        web.getEngine().reload();
    }

    @FXML
    private void shoutOutAction(ActionEvent event) {
        web.getEngine().executeScript("document.shoutOut()");
    }

    @FXML
    private void restoreAction(ActionEvent event) {
        web.getEngine().executeScript("initialize()");
    }
    
    
}
