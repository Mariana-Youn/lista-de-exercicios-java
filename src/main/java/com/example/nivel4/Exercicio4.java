package com.example.nivel4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double raio;

        System.out.println("Informe o raio do circulo: ");
        raio = entrada.nextDouble();

        double area = Math.PI * raio * raio;

        System.out.println("Area do circulo: " + area);

        entrada.close();
    }
}