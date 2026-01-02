import java.util.*;
public class stbuff {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split(" ");
        String rev = "";
        for(String words:word){
            StringBuilder sb = new StringBuilder(words);
            sb.reverse();
            rev=rev+sb.toString()+" ";    
        }
        System.out.println(rev);

    }
    
}
