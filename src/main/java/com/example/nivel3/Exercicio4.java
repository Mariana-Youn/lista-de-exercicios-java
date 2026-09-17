package com.example.nivel3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double base, altura;

        System.out.println("Informe a base do retangulo: ");
        base = entrada.nextDouble();

        System.out.println("Informe a altura do retangulo: ");
        altura = entrada.nextDouble();

        double perimetro = 2 * (base + altura);

        System.out.println("Perimetro do retangulo: " + perimetro);

        entrada.close();
    }
}