
import java.util.Scanner;
public class arr{
    public static void main(String[] args){
        int n,i;

        Scanner a = new Scanner(System.in);
        n=a.nextInt();
        int[] numbers=new int[50];
        for (i=0;i<n;i++){
            numbers[i]=a.nextInt();
        }
        for (i=0;i<n;i++){
            System.out.println(numbers[i]);
        }
    }
}
