package br.com.alura.desafios.desafio04;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(celsius + "ºC em Fahrenheit é igual a: " + fahrenheit + "ºF\n");
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println(fahrenheit + "ºF em Celsius é igual a: " + celsius + "ºC\n");

    }
}
