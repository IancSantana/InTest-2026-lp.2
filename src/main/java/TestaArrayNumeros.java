import java.util.Scanner;

public class TestaArrayNumeros {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite 3 números inteiros separados por espaço");
        String [] numerosStr = leitor.nextLine().split(" ");
        int [] numeros = new int[3];
        for (int k=0; k< 3; k++){
            numeros[k] = Integer.parseInt(numerosStr[k]);
        }
        System.out.println("Os números lidos foram:");
        int k=0;
        while(k<3){
            System.out.println(numeros[k]);
            k++;
        }

        System.out.println("a SOMA DOS NÚMEROS É "+ somaNumeros(numeros) );

        leitor.close();
    }

    public static int somaNumeros(int [] numerosASomar){
        int soma = 0;
        int k=0;
        while(k<numerosASomar.length){
            soma+=numerosASomar[k];
            k++;
        }
        return soma;
    }

}

