//程序填空，不要改变与输入输出有关的语句。
//输入1个实数x，计算并输出其平方根。
//例：
//输入
//1.21
//输出
//The square root of 1.21 is 1.1

import java.io.*;
import java.util.Scanner;
public class Test20002{
     public static void main(String args[]){
        double x, root;
        Scanner in=new Scanner(System.in);
        x=in.nextDouble();
        root=Math.sqrt(x);
        System.out.println("The square root of "+x+" is "+root);
   }
}