package org.jvrb.java.temp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Calendar;

public class TempController {

    @FXML
    private Label date;

    @FXML
    private TextField inputTemp;

    @FXML
    private TextField outputTemp;

    @FXML
    void initialize () {
        date.setText(String.valueOf(Calendar.getInstance().getTime()));
    }

    @FXML
    protected void onCelsiusButtonClick() {
        try {
            double celsius = Double.parseDouble(inputTemp.getText());
            outputTemp.setText(celsius + "ºC");
        } catch (NumberFormatException e) {
            processException();
        }
    }

    @FXML
    protected void onFahrenheitButtonClick() {
        try {
            double celsius = Double.parseDouble(inputTemp.getText());
            double fahrenheit = celsius * 9 / 5 + 32;
            outputTemp.setText(fahrenheit + "ºF");
        } catch (NumberFormatException e) {
            processException();
        }
    }

    @FXML
    protected void onKelvinButtonClick() {
        try {
            double celsius = Double.parseDouble(inputTemp.getText());
            double kelvin = celsius + 273.15;
            outputTemp.setText(kelvin + " K");
        } catch (NumberFormatException e) {
            processException();
        }
    }

    private void processException() {
        outputTemp.clear();
        System.out.println("ERROR: Valor no numérico");
    }
}