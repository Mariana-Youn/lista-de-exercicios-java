package com.example.nivel3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double lado;

        System.out.println("Informe o valor do lado do quadrado: ");
        lado = entrada.nextDouble();

        double area = lado * lado;

        System.out.println("Area do quadrado: " + area);

        entrada.close();
    }
}