import java.util.*;
public class traanspose {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter no.of cols: ");
        int col = sc.nextInt();
        System.out.println("enter elements : ");
        int[][] arr = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j=0; j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] tp = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                tp[j][i] = arr[i][j];
            }
        }
        System.out.println("transpose of a matrix : ");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(tp[i][j]+" ");
            }
            System.out.println();
        }

    }
}
