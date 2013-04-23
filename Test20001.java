//程序填空，不要改变与输入输出有关的语句。
//输入整数a和b，计算并输出a、b的和与差。
//例：
//输入
//2  -8
//输出
//The sum is -6
//The difference is 10

import java.util.Scanner;
public class Test20001{
     public static void main(String args[]){
        int a, b, sum, diff;
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        sum=a+b;
        diff=a-b;
        System.out.println("The sum is "+sum);
        System.out.println("The difference is "+diff);
   }
}