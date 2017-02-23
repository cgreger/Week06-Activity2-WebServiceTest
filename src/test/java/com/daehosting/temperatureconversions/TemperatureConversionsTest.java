package com.daehosting.temperatureconversions;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by katana on 2/23/17.
 */
public class TemperatureConversionsTest {

    TemperatureConversionsSoapType service;

    @Before
    public void setUp() {

        service = new TemperatureConversions().getTemperatureConversionsSoap12();

    }

    @Test
    public void celsiusToFahrenheit() throws Exception {

        //Celsius to Fahrenheit
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0));
        assertEquals("Failed to correctly convert Celsius to Fahrenheit.", BigDecimal.valueOf(32), celsiusToFahrenheitResult);

    }

    @Test
    public void fahrenheitToCelsius() throws Exception {

        //Fahrenheit to Celsius
        BigDecimal fahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals("Failed to correctly convert Fahrenheit to Celsius", BigDecimal.valueOf(0), fahrenheitToCelsiusResult);

    }

    @Test
    public void windChillInCelsius() throws Exception {

        BigDecimal windChillInCelsiusResult = service.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(10));
        assertEquals("Failed to calculate Wind Chill in Celsius.", BigDecimal.valueOf(-8.97), windChillInCelsiusResult);

    }

    @Test
    public void windChillInFahrenheit() throws Exception {

        BigDecimal windChillInFahrenheit = service.windChillInFahrenheit(BigDecimal.valueOf(32), BigDecimal.valueOf(10));
        assertEquals("Failed to calculate Wind Chill in Fahrenheit.", BigDecimal.valueOf(15.854), windChillInFahrenheit);


    }
}