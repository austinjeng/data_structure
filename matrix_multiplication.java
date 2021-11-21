
import java.util.*;

public class matrix_multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size(n) of the matrix(n*n) : ");
        int n = input.nextInt(); 
        int a[][]=new int[n][n]; 
        int b[][]=new int[n][n]; 
        int c[][]=new int[n][n];

        System.out.println("Please enter the numbers of matrix1 : "); 
        for(int i = 0 ; i <n ; i++) {
            for(int j = 0 ; j<n ;j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Please enter the numbers of matrix2 : ");
        for(int i = 0 ; i <n ; i++) {
            for(int j = 0 ; j<n ;j++) {
                b[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrixmultiply : "); 
        matrixmultiply(a,b,c,n);
        input.close();
    }

    public static void matrixmultiply(int[][] a, int[][] b, int[][] c, int n )
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                c[i][j] = 0;
            }
        }

        for(int i = 0; i < n; i++){
            for (int k = 0; k < n; k++) {
                for(int j = 0; j < n; j++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                if(j < n - 1){
                    System.out.print(c[i][j] + " ");
                } else{
                    System.out.println(c[i][j]);
                }
            }
        }
    }
}
