package br.ufpb.ru;

import java.util.Scanner;

public class CalculoGastoRU {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de almoços realizados:");
        int n = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite o preço de cada refeição de almoço:");
        double preco = Double.parseDouble(leitor.nextLine());

        double totalGasto = n * preco;

        System.out.printf("Valor total gasto pelo RU com almoços: R$ %.2f\n", totalGasto);

        leitor.close();
    }
}