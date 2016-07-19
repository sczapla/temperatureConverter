/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sczapla.temperatureconverter;

public class Converter {
    private final double KELVIN_ZERO = 273.15;
    private final double FAHRENHEIT_ZERO = 459.67;
    
    public String celciusToFahrenheit(double celcius){
        return String.valueOf(celcius * 1.8 + 32.0);
    }
    public String celciusToKelvin(double celcius){
        return String.valueOf(celcius + KELVIN_ZERO);
    }
    public String kelvinToCelcius(double kelvin){
        return String.valueOf(KELVIN_ZERO-kelvin);
    }
    public String kelvinToFahrenheit(double kelvin){
        return String.valueOf((kelvin - KELVIN_ZERO)* 1.8000 + 32.00);
    }
    public String fahrenheitToCelcius(double fahrenheit){
        return String.valueOf((fahrenheit - 32 ) * 5/9);
    }
    public String fahrenheitToKelvin(double fahrenheit){
        return  String.valueOf((fahrenheit + FAHRENHEIT_ZERO) * 5/9);
    }
    
    
}
