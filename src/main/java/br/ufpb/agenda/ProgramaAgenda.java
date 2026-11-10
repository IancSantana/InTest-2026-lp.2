package br.ufpb.agenda;

import java.util.Scanner;

public class ProgramaAgenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaEnderecos agenda = new AgendaEnderecos(100);
        boolean sair = false;

        while (!sair) {
            System.out.println("\n--- MENU AGENDA ---");
            System.out.println("1. Cadastrar Contato");
            System.out.println("2. Pesquisar Endereço");
            System.out.println("3. Apagar Contato");
            System.out.println("4. Sair");
            System.out.print("Opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Logradouro: ");
                String logradouro = scanner.nextLine();
                System.out.print("Número: ");
                String numero = scanner.nextLine();
                System.out.print("Bairro: ");
                String bairro = scanner.nextLine();
                System.out.print("Cidade: ");
                String cidade = scanner.nextLine();
                System.out.print("Estado: ");
                String estado = scanner.nextLine();

                Endereco end = new Endereco(logradouro, numero, bairro, cidade, estado);
                if (agenda.cadastraContato(nome, end)) {
                    System.out.println("Contato cadastrado com sucesso!");
                } else {
                    System.out.println("Agenda cheia!");
                }
            } else if (opcao == 2) {
                System.out.print("Nome para pesquisar: ");
                String nome = scanner.nextLine();
                Endereco end = agenda.pesquisaEndereco(nome);
                if (end != null) {
                    System.out.println("Endereço: " + end.toString());
                } else {
                    System.out.println("Contato não encontrado.");
                }
            } else if (opcao == 3) {
                System.out.print("Nome para apagar: ");
                String nome = scanner.nextLine();
                if (agenda.apagaContato(nome)) {
                    System.out.println("Contato apagado com sucesso.");
                } else {
                    System.out.println("Contato não encontrado.");
                }
            } else if (opcao == 4) {
                sair = true;
            }
        }
        scanner.close();
    }
}