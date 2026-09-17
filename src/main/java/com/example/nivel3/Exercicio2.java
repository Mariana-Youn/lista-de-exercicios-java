package com.example.nivel3;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double celsius;

        System.out.println("Informe a temperatura em graus Celsius: ");
        celsius = entrada.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        entrada.close();
    }
}