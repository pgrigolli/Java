package application;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        int[] count = new int[n];
        int idx = 0;
        int[] negatives = new int[n*n];
        int negative_index = 0;


        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                mat[i][j] = sc.nextInt();
            }
        }




        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if(i == j){
                    count[idx] = mat[i][j];
                    idx++;
                }
                if(mat[i][j] < 0) {
                    negatives[negative_index] = mat[i][j];
                    negative_index++;
                }
            }
        }

        System.out.println("Diagonal Principal: ");
        for(int number: count){
            System.out.print(number + " ");
        }
        System.out.println();
        
        System.out.println("Numeros negativos: ");
        for(int number: negatives){
            if(number < 0){
                System.out.print(number + " ");
            }
        }
        
        sc.close();
    }
    
}
