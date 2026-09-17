package com.example.nivel5;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Informe o primeiro numero: ");
        numero1 = entrada.nextInt();

        System.out.println("Informe o segundo numero: ");
        numero2 = entrada.nextInt();

        int quociente = numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println("Quociente da divisao: " + quociente);
        System.out.println("Resto da divisao: " + resto);

        entrada.close();
    }
}