import java.util.Scanner;

public class TestandoIF {

    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = leitor.nextLine();
        System.out.println("Oi "+ nome);
        System.out.println("Quantos anos você tem?");
        int idade = Integer.parseInt(leitor.nextLine());
        if (idade<18){
            System.out.println("Você é de menor");
        } else if (idade>=60){
            System.out.println("Você é idoso(a)");
        } else {
            System.out.println("Você é adulto(a)");
        }
        System.out.println("Você tem "+ (idade++)+ " anos");
        System.out.println("Vocë vai fazer "+ idade+ "  anos");

        leitor.close();
    }
}