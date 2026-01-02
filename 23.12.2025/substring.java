public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        StringBuilder str = new StringBuilder(a);
        str.reverse();
        System.out.println(str.toString());
