import java.util.Scanner;
public class Test30010{
     public static void main(String args[]){
         int repeat, ri;
         char ch;
         Scanner in=new Scanner(System.in);
         repeat=in.nextInt();
         for(ri = 1; ri <= repeat; ri++){
             ch=(in.next()).charAt(0);
             switch (ch) {
                case 'A':
                    System.out.println("90-100");
                    break;
                case 'B':
                    System.out.println("80-89");
                    break;
                case 'C':
                    System.out.println("70-79");
                    break;
                case 'D':
                    System.out.println("60-69");
                    break;
                case 'E':
                    System.out.println("0-59");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
             }
         }
   }
}
