package com.example.nivel4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valorHora;
        int horasTrabalhadas;

        System.out.println("Informe o valor da hora trabalhada: ");
        valorHora = entrada.nextDouble();

        System.out.println("Informe o numero de horas trabalhadas no mes: ");
        horasTrabalhadas = entrada.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;

        System.out.println("Salario bruto: " + salarioBruto);

        entrada.close();
    }
}