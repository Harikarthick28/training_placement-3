import java.util.Scanner;
public class strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ab=sc.nextLine();
        String a ="";
        for(int i=ab.length()-1;i>=0;i--){
            //System.out.print(ab.charAt(i));
            a=a+ab.charAt(i);

        }
        System.out.println(a);
        if(a.equals(ab)){
        System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
    
