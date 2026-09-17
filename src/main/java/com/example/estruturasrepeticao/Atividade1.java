package com.example.estruturasrepeticao;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        int contador;

        for (contador = 1; contador <= 10; contador++) {
            System.out.print("Registre seu nome: ");
            nome = entrada.nextLine();
            System.out.println(nome + " está registrado(a) como participante " + contador);
        }

        entrada.close();
    }
}