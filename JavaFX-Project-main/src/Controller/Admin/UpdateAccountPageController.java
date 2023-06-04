/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Admin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mohammed F Sharaf
 */
public class UpdateAccountPageController implements Initializable {

    @FXML
    private TextField usernameTF;
    @FXML
    private TextField accountNmuberTF;
    @FXML
    private Button updateAccountBtn;
    @FXML
    private Button cancelBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void updateAccount(ActionEvent event) {
    }

    @FXML
    private void cancelCreation(ActionEvent event) {
    }
    
}
