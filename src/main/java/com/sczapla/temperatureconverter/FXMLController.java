package com.sczapla.temperatureconverter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class FXMLController implements Initializable {
    
    @FXML
    private RadioButton inCelcius;
    @FXML
    private RadioButton inFahrenheit;
    @FXML
    private RadioButton inKelvin;
    
    @FXML
    private RadioButton outCelcius;
    @FXML
    private RadioButton outFahrenheit;
    @FXML
    private RadioButton outKelvin;
    
    private Converter converter;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inCelcius.setSelected(true);
        outFahrenheit.setSelected(true);
        converter = new Converter();
    }    

    @FXML
    private void convertValue(ActionEvent event) {
        
    }

    @FXML
    private void checkInCelcius(ActionEvent event) {
        inFahrenheit.setSelected(false);
        inKelvin.setSelected(false);
    }

    @FXML
    private void checkInFahrenheit(ActionEvent event) {
        inKelvin.setSelected(false);
        inCelcius.setSelected(false);
    }

    @FXML
    private void checkInKelvin(ActionEvent event) {
        inCelcius.setSelected(false);
        inFahrenheit.setSelected(false);
    }

    @FXML
    private void checkOutKelvin(ActionEvent event) {
        outCelcius.setSelected(false);
        outFahrenheit.setSelected(false);
    }

    @FXML
    private void checkOutFahrenheit(ActionEvent event) {
        outKelvin.setSelected(false);
        outCelcius.setSelected(false);
    }

    @FXML
    private void checkOutCelcius(ActionEvent event) {
        outFahrenheit.setSelected(false);
        outKelvin.setSelected(false);
    }
}
