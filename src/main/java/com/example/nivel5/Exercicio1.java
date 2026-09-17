package com.example.nivel5;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double peso, altura;

        System.out.println("Informe o peso em kg: ");
        peso = entrada.nextDouble();

        System.out.println("Informe a altura em metros: ");
        altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        entrada.close();
    }
}