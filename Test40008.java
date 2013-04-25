//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//读入一批正整数(以零或负数为结束标志)，求其中的奇数和。
//例：括号内是说明
//输入
//2   (repeat=2)
//1 3 90 7 0
//8 7 4 3 70 5 6 101 -1
//输出
//11
//116

import java.util.Scanner;
public class Test40008 {
   public static void main(String[] args){
      int ri, repeat;
      int x, sum;
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
          x=in.nextInt();
          sum=0;
          while (x>0) {
        	  if (x%2==1) {
        		  sum+=x;
        	  }
        	  x=in.nextInt();
          }
          System.out.println(sum);
      }
   }
}