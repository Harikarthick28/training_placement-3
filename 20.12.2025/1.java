import java.util.Scanner;
public class rev
{
	public static void main(String[] args) {
	    int n,i;

        Scanner a = new Scanner(System.in);
        n=a.nextInt();
        int[] numbers=new int[50];
        for (i=1;i<=n;i++){
            numbers[i]=a.nextInt();
        }
        
		for (i=n;i>=1;i--){
		        System.out.print(numbers[i]+" ");
        }
		
	}
}
