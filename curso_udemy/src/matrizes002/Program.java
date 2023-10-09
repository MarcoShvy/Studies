package matrizes002;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite numero de linha da matriz");
        int n = sc.nextInt();
        System.out.println("Digite numero de coluna da matriz");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        for (int i = 0; i <mat.length; i++) {
            for (int j = 0; j <mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Qual numero deseja encontrar");
        int x = sc.nextInt();

        for (int i = 0; i <mat.length; i++) {
            for (int j = 0; j <mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("position = "+ i+", "+j);
                    if(j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i > 0 ) {
                        System.out.println("up: "+ mat[i-1][j]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }
        sc.close();
}
}