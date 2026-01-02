import java.util.*;
public class palindromearray
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int rev[] = new int[n];
	    for(int i=0;i<n;i++){
	        rev[i]=arr[n-1-i];
	        //System.out.print(arr[i]);
	    }
	    if(Arrays.equals(arr,rev)){
	        System.out.println("palindrome");
	    }else{
	        System.out.println("Not a palindrome");
	    }	
	}
}
