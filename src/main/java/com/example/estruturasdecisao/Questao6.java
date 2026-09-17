package com.example.estruturasdecisao;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        if (salario <= 4000) {
            System.out.println("Possui o Benefício");
        } else {
            System.out.println("Não possui");
        }

        sc.close();
    }
}