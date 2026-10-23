//Exercício 4 - Função para Converter Graus Celsius para Fahrenheit

package com.example.funcoes;

public class Exercicio4
{
    public static void main(String args[])
    {
        double resultado = converterCelsiusParaFahrenheit(25);

        System.out.println("Temperatura em Fahrenheit: " + resultado);
    }

    public static double converterCelsiusParaFahrenheit(double celsius)
    {
        return celsius * 1.8 + 32;
    }
}