//程序填空，不要改变与输入输出有关的语句。
//输入一个3位数n，分别求出 n 的个位数字(c)、十位数字(b)和百位数字(a)的值。
//
//输入输出示例：
//输入：
//152
//输出：
//number152:digit1=2,digit2=5,digit3=1

import java.util.Scanner;
public class Test20011{
     public static void main(String args[]){
    	 int a,b,c,n;
    	 Scanner in=new Scanner(System.in);
    	 n=in.nextInt();
    	 c=n%10;
    	 b=n/10%10;
    	 a=n/100;
    	 System.out.println("number"+n+":digit1="+c+",digit2="+b+",digit3="+a);
   }
}