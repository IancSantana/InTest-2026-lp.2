package exercicio6_1;

import java.util.Scanner;

public class ProgramaDescontos {

    public static double calculaValorComDesconto(double valorProduto) {
        if (valorProduto < 50) {
            return valorProduto;
        } else if (valorProduto < 100) {
            return valorProduto - (valorProduto * 0.05);
        } else {
            return valorProduto - (valorProduto * 0.10);
        }
    }

    public static double calculaSomatorioDescontos(Produto[] produtos) {
        double totalDescontos = 0.0;
        for (int i = 0; i < produtos.length; i++) {
            double precoOriginal = produtos[i].getPreco();
            double precoComDesconto = calculaValorComDesconto(precoOriginal);
            totalDescontos += (precoOriginal - precoComDesconto);
        }
        return totalDescontos;
    }

    public static String verificaProdutoComMaiorDesconto(Produto[] produtos) {
        if (produtos.length == 0) return "";

        String nomeMaior = produtos[0].getNome();
        double maiorDesconto = produtos[0].getPreco() - calculaValorComDesconto(produtos[0].getPreco());

        for (int i = 1; i < produtos.length; i++) {
            double descontoAtual = produtos[i].getPreco() - calculaValorComDesconto(produtos[i].getPreco());
            if (descontoAtual > maiorDesconto) {
                maiorDesconto = descontoAtual;
                nomeMaior = produtos[i].getNome();
            }
        }
        return nomeMaior;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());
        Produto[] produtos = new Produto[quant];

        for (int k = 0; k < quant; k++) {
            Produto p = new Produto();
            System.out.println("Qual o nome do produto?");
            p.setNome(leitor.nextLine());
            System.out.println("Qual o preço original do produto?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));
            produtos[k] = p;
        }

        double somatorioDescontos = calculaSomatorioDescontos(produtos);
        String produtoMaiorDesconto = verificaProdutoComMaiorDesconto(produtos);

        System.out.printf("Somatório dos descontos: R$ %.2f\n", somatorioDescontos);
        System.out.println("Produto com maior desconto: " + produtoMaiorDesconto);

        leitor.close();
    }
}