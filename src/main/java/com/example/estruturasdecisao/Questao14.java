package com.example.estruturasdecisao;

import java.util.Scanner;


public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo médio mensal: ");
        double saldoMedio = sc.nextDouble();

        if (saldoMedio > 5000) {
            System.out.print("Autorizado à isenção de tarifa.");
        }

        else {
            System.out.print("Saldo insuficiente, tarifa será mantida.");
        }

        sc.close();

    }

}
