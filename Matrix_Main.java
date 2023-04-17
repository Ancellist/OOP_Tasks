public class Matrix_Main {
    public static void main(String[] args) {
        int[][] arr ={{1,1,1,1,1},
                {2,2,2,2,2},
                {3,3,3,3,3},
                {4,4,4,4,4},
                {5,5,5,5,5}};
        int[][] arr2 = {{1,1,1,1,1},
                {2,2,2,2,2},
                {3,3,3,3,3},
                {4,4,4,4,4},
                {5,5,5,5,5}};
        int num = 2;
        //Matrix.Summation_Matrix(arr,arr2);
        //Matrix.MultiplicationOnOneNum_Matrix(arr,num);
        Matrix.MultiplicationMatrixOnMatrix(arr,arr2);
        Matrix.Print_Arr(arr);
    }
}
