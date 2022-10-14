import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // seven wonders
        // Debut du jeu
        Chess chess = new Chess();
        chess.play();
    }

}








    /*
    public static void main(String[] args) {
        int[] a = new int[6];
        a[0] = 7;
        a[1] = 8;
        a[2] = 2;
        a[3] = 4;
        a[4] = 1;
        a[5] = 9;
        System.out.println(Arrays.toString(a));
        int k = 4;
        System.out.println(maFonction(a, k));
    }
    /**
     * Retourne un boolean qui indique si k est la somme de 2 elements du tableau
     * @param a
     * @param k
     * @return

    public static boolean maFonction(int[] a, int k) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if ((a[i] + a[j]) == k) {
                    System.out.println(a[i] + " + " + a[j] + " = " + k );
                    return true;
                }
            }
        }
        return false;
    }
    */