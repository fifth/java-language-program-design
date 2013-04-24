//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入四个整数，输出其中的最小值。
//例：括号内是说明
//输入
//3  (repeat=3) 
//12 6 1 90
//10 40 30 20
//-1 -3 -4 -5
//输出
//min is 1 (12 6 1 90 中的最小值是1)
//min is 10 (10 40 30 20 中的最小值是10)
//min is -5 (-1 -3 -4 -5中的最小值是-5)

import java.util.Scanner;
public class Test30002 {
   public static void main(String[] args){
      int ri, repeat;
      int a, b, c, d, min;
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
          a=in.nextInt();
          b=in.nextInt();
          c=in.nextInt();
          d=in.nextInt();
          min=a;
          if (b<min) {
        	  min=b;
          }
          if (c<min) {
        	  min=c;
          }
          if (d<min) {
        	  min=d;
          }
          System.out.println("min is "+min);
      }
   }
}