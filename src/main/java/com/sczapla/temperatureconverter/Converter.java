/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sczapla.temperatureconverter;

public class Converter {
    private final int KELVIN_ZERO = 273;
    
    public double celciusToFahrenheit(double celcius){
        return celcius * 1.8 + 32.0;
    }
    public double celciusToKelvin(double celcius){
        return KELVIN_ZERO+celcius;
    }
    public double kelvinToCelcius(double kelvin){
        return 0;
    }
    public double kelvinToFahrenheit(double kelvin){
        return 0;
    }
    public double fahrenheitToCelcius(double fahrenheit){
        return 0;
    }
    public double fahrenheitToKelvin(double fahrenheit){
        return 0;
    }
}
