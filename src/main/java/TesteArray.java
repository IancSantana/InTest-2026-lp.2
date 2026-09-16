public class TesteArray {
    public static void main(String [] args){
        System.out.println("Args:");
        if (args.length >0){
            System.out.println("O programa tem argumentos");
            for (int k=0; k< args.length; k++){
                System.out.println("Args["+k+"]:"+ args[k]);
            }
        } else {
            System.out.println("O programa não recebeu argumentos");
        }
    }
}