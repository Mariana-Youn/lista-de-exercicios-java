package com.example.nivel5;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double metros;

        System.out.println("Informe o valor em metros: ");
        metros = entrada.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println("Valor em centimetros: " + centimetros);
        System.out.println("Valor em milimetros: " + milimetros);

        entrada.close();
    }
}