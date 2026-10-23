//Exercício 6 - Função para Verificar se um Número é Par

package com.example.funcoes;

public class Exercicio6
{
    public static void main(String args[])
    {
        boolean resultado = verificarPar(8);

        System.out.println("O número é par? " + resultado);
    }

    public static boolean verificarPar(int numero)
    {
        return numero % 2 == 0;
    }
}