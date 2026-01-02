import java.util.*;
public class trainbirth {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        if(n>=1 && n<=72){
            if(n%8==3 || n%8==6){
            System.out.print("Upper birth");
        }else if(n%8==2 || n%8==5){
            System.out.print("Middle birth");
        }else if(n%8==1 || n%8==4){
            System.out.print("Lower birth");
        }else if(n%8==7){
            System.out.print("side lower birth");
        }else if(n%8==0){
            System.out.print("Side upper birth");
        }
    }else{
        System.out.print("invalid");
    }
    }
    
}
