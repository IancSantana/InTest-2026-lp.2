package br.ufpb.chatbot;

import java.util.Scanner;

public class ProgramaChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA CHATBOT DE ATENDIMENTO ===");
        System.out.print("Digite o ID do cliente: ");
        String id = scanner.nextLine();

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();

        Cliente c1 = new Cliente(id, nome, telefone, "ATIVO");

        System.out.println("\nCliente cadastrado no sistema:");
        System.out.println(c1.toString());

        scanner.close();
    }
}