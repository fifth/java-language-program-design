import java.util.Scanner;
public class Test30008{
     public static void main(String args[]){
    	 int repeat, ri,x;
    	 double y;
    	 Scanner in=new Scanner(System.in);
    	 repeat=in.nextInt();
    	 for(ri = 1; ri <= repeat; ri++){
    		 x=in.nextInt();
             if (x==0) {
                y = 0;
             } else {
                y = 1.0/x;
             }
             y = ((int)(y*100+0.5))/100.0;
    		 System.out.println("f("+x+")="+y);
		 }
   }
}
