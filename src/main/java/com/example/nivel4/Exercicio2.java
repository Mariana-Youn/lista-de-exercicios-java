package com.example.nivel4;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double distancia, combustivel;

        System.out.println("Informe a distancia percorrida em km: ");
        distancia = entrada.nextDouble();

        System.out.println("Informe o combustivel gasto em litros: ");
        combustivel = entrada.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.println("Consumo medio: " + consumoMedio + " km/l");

        entrada.close();
    }
}