package chapter_3_exercises;

import static org.junit.Assert.assertEquals;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class FahrenheitCelciusConverterTest {

    private Integer[][] temperatures() {
        return new Integer[][] {{-10,14},{0,32},{10,50}};
    }

    @Test
    @Parameters(method = "temperatures")
    public void shouldConvertCelciusToFahrenheit(int celsius, int fahrenheit) {
        assertEquals(fahrenheit, FahrenheitCelciusConverter.toFahrenheit(celsius));
    }

    @Test
    @Parameters(method = "temperatures")
    public void shouldConvertFahrenheitToCelcius(int celsius, int fahrenheit) {
        assertEquals(celsius, FahrenheitCelciusConverter.toCelcius(fahrenheit));
    }

}
