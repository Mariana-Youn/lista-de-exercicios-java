package com.example.nivel5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int totalSegundos;

        System.out.println("Informe a quantidade total de segundos: ");
        totalSegundos = entrada.nextInt();

        int horas = totalSegundos / 3600;
        int resto = totalSegundos % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(horas + " horas, " + minutos + " minutos e " + segundos + " segundos");

        entrada.close();
    }
}