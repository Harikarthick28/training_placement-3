
import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        int n,flag;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        flag=1;

        if(n<2){
            flag=2;
        }

        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=2;
                break;
            }
        }
        if(flag==1){
            System.out.println("prime number");
        }else{
            System.out.println("not prime");
        }
    }

}
