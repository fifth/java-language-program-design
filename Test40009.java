//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一个正整数n, 再输入n个整数，输出最大值。
//例：括号内是说明
//输入
//3   (repeat=3) 
//4 2 123 -100 0 
//4 9 1 -1 8 
//3 1 3 5 
//输出
//123
//9
//5

import java.util.Scanner;
public class Test40009 {
   public static void main(String[] args){
      int ri, repeat;
      int i , max, n, x;
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
         n=in.nextInt();
         x=in.nextInt();
         max=x;
         for (i=2; i<=n; i++) {
        	 x=in.nextInt();
        	 if (x>max) {
        		 max=x;
        	 }
         }
         System.out.println(max);
      }
   }
}