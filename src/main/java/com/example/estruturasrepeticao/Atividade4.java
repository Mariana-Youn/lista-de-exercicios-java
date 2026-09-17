package com.example.estruturasrepeticao;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota, contador = 0;

        while (contador < 10) {
            contador++;
            System.out.println("Cliente " + contador + ", avalie a loja de 1 a 10.");
            nota = entrada.nextInt();
            System.out.println("Nota registrada: " + nota);
        }

        System.out.println(contador + " clientes avaliaram a loja!");

        entrada.close();
    }
}