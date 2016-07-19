package com.sczapla.temperatureconverter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

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
    @FXML
    private TextField input;
    @FXML
    private TextField output;

    private Converter converter;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inCelcius.setSelected(true);
        outFahrenheit.setSelected(true);
        converter = new Converter();
    }

    @FXML
    private void convertValue(ActionEvent event) {
        convertTemperature()
    }

    @FXML
    private void checkInCelcius(ActionEvent event) {
        inFahrenheit.setSelected(false);
        inKelvin.setSelected(false);
        convertTemperature()
    }

    @FXML
    private void checkInFahrenheit(ActionEvent event) {
        inKelvin.setSelected(false);
        inCelcius.setSelected(false);
        convertTemperature()
    }

    @FXML
    private void checkInKelvin(ActionEvent event) {
        inCelcius.setSelected(false);
        inFahrenheit.setSelected(false);
        convertTemperature()
    }

    @FXML
    private void checkOutKelvin(ActionEvent event) {
        outCelcius.setSelected(false);
        outFahrenheit.setSelected(false);
        convertTemperature()
    }

    @FXML
    private void checkOutFahrenheit(ActionEvent event) {
        outKelvin.setSelected(false);
        outCelcius.setSelected(false);
        convertTemperature()
    }

    @FXML
    private void checkOutCelcius(ActionEvent event) {
        outFahrenheit.setSelected(false);
        outKelvin.setSelected(false);
        convertTemperature()
    }
    
    private void convertTemperature(){
	if (inCelcius.isSelected()) {
            celciusConvert();
        } else if (inFahrenheit.isSelected()) {
            fahrenheitConvert();
        } else if (inKelvin.isSelected()) {
            kelvinConvert();
        }
    }

    private void celciusConvert() {
        if (outFahrenheit.isSelected()) {
            output.setText(converter.celciusToFahrenheit(Double.valueOf(input.getText())));
        } else if (outKelvin.isSelected()) {
            output.setText(converter.celciusToKelvin(Double.valueOf(input.getText())));
        } else {
            output.setText(input.getText());
        }
    }

    private void fahrenheitConvert() {
        if (outCelcius.isSelected()) {
            output.setText(converter.fahrenheitToCelcius(Double.valueOf(input.getText())));
        } else if (outKelvin.isSelected()) {
            output.setText(converter.fahrenheitToKelvin(Double.valueOf(input.getText())));
        } else {
            output.setText(input.getText());
        }
    }

    private void kelvinConvert() {
        if (outFahrenheit.isSelected()) {
            output.setText(converter.kelvinToFahrenheit(Double.valueOf(input.getText())));
        } else if (outCelcius.isSelected()) {
            output.setText(converter.kelvinToCelcius(Double.valueOf(input.getText())));
        } else {
            output.setText(input.getText());
        }
    }
}
