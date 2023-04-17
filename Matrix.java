import java.util.Arrays;

public class Matrix {
    public int[][] arr1 = new int[i][j];
    public static int i = 5;
    public static int j = 5;

    public static void Summation_Matrix(int[][] arr1,int[][] arr2) {
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1[j].length; i++) {
                arr1[j][i] = arr1[j][i] + arr2[j][i];
            }
        }
    }

    public static void MultiplicationOnOneNum_Matrix(int[][] arr1, int num){
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1[j].length; i++) {
                arr1[j][i] = arr1[j][i] * num;
            }
        }
    }

    public static void Print_Arr(int[][] arr1){
        for (int[] ints : arr1) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void MultiplicationMatrixOnMatrix(int[][] arr1,int[][] arr2){
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1[j].length; i++) {
                arr1[j][i] = arr1[j][i] * arr2[i][j];
            }
        }
    }
}
