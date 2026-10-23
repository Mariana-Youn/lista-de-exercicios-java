//Exercício 3 - Função para Calcular o Dobro de um Número

package com.example.funcoes;

public class Exercicio3
{
    public static void main(String args[])
    {
        int resultado = dobrar(6);

        System.out.println("O dobro do número é: " + resultado);
    }

    public static int dobrar(int numero)
    {
        return numero * 2;
    }
}