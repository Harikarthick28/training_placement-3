import java.util.*;
public class neon {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int sum =0;
        int sq=a*a;
        while(sq>0){
            int rem=sq%10;
            sum = sum+rem;
            sq=sq/10;
        }
        if(a==sum){
            System.out.println(a+" is a neon number");
        }else{
            System.out.println(a+" is not  a neon number");
        }
        //System.out.print(sum);
    }
    
}
