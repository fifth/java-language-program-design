//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一个整数，输出它的位数以及各位数之和。
//例：括号内是说明
//输入
//4   (repeat=4) 
//123456  -100  -1   99
//输出
//number=6, sum=21 (123456的位数是6, 各位数之和是21)
//number=3, sum=1 (-100的位数是3, 各位数之和是1)
//number=1, sum=1 (-1的位数是1, 各位数之和是1)
//number=2, sum=18 (99的位数是2, 各位数之和是18)

import java.util.Scanner;
public class Test40010 {
   public static void main(String[] args){
      int ri, repeat;
      int number, sum,n;
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
         n=in.nextInt();
         if (n<0) {
        	 n=-n;
         }
         number=0;
         sum=0;
         while (n/10!=0) {
        	 number++;
        	 sum+=n%10;
        	 n/=10;
         }
         number++;
         sum+=n;
         System.out.println("number="+number+", sum="+sum);
      }
   }
}