import java.util.*;
public class vte {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            if(age==18){
                System.out.println("Eligible for vote");
            }
            if(age>18 && age<=24){
                System.out.println("Adult vote");
            }
            else if(age>24 && age<=59){
                System.out.println("Senior vote");
            }else if(age>59){
                System.out.println("Senior citizen vote");
            }
        }
        else{
            System.out.println("not eligible");
        }
    }
 
}
    
