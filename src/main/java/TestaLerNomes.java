import javax.swing.JOptionPane;

public class TestaLerNomes {
    public static void main(String [] args){
        String nomes = JOptionPane.showInputDialog("Digite 3 nomes separados por espaço");
        System.out.println("Os nomes lidos foram:"+ nomes);

        String nomes2 = JOptionPane.showInputDialog("Digite vários nomes separados por espaço");
        String [] listaDeNomes = nomes2.split(" ");
        System.out.println("Nomes2:");
        for (int k=0; k< listaDeNomes.length; k++){
            System.out.println(listaDeNomes[k]);
        }

    }
}