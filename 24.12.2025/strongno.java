
import java.util.Scanner;
public class strongno {
    public static void main(String[] args){
        int num,i,digit,fact,og;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();
        og=num;
        int s=0;
        
        while(num>0){
        digit = num%10;
        fact=1;

        for(i=1;i<=digit;i++){
            fact=fact*i;
        }
        s=s+fact;
        num=num/10;
        }
        
    if(og==s){
        System.out.println("strong number!");
    }else{
        System.out.println("not a strongest number!");
    }
}}
