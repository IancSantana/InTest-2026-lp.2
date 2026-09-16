public class TestaFor {

    public static void main(String [] args){
        int n = 4;
        int k = 1;
        while(k<=n){
            System.out.println("Oi número "+k);
            k++;
        }
        System.out.println("Repetindo com for");
        for ( int j=1  ; j<=n ; j++  ){
            System.out.println("Tchau número "+j);
        }

    }
}
