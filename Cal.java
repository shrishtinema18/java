import java.util.Scanner;
class Cal{
 public static void main (String[] args ){
        Scanner o = new Scanner(System.in);
        System.out.println("Enter 1st no. :");
        int a = o.nextInt();
        System.out.println("Enter 2nd no.:");
        int b = o.nextInt();
        System.out.println("Enter your command:");
        char c= o.next().charAt(0);
        switch (c){

            case '+' :
            System.out.println(a+b);
            break;

            case '-' :
            System.out.println(a-b);
            break;

            case '*' :
            System.out.println(a*b);
            break; 
            
            case '/' :
            System.out.println(a/b);
            break;
            
            default:
            System.out.println("bagg jao");
 
        }
}

}