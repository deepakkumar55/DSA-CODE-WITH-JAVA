package Array;

import java.util.Arrays;

public class multi_array {
    public static void main(String[] args) {
        // int[][] arr = {{1,2,3},{4,3,1},{5,4,3},{5,4,3}};
        
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.print(",");
        // }   
        
        int [][] arr=new int[3][3];
        arr[0][0]=5;
        arr[0][1]=2;
        arr[0][2]=1;
        arr[1][0]=8;
        arr[1][1]=9;
        arr[1][2]=7;
        arr[2][0]=5;
        arr[2][1]=7;
        arr[2][2]=6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
















    }
}
