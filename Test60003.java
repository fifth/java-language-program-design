//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一个正整数n (1<n≤10)，再输入n个整数，按逆序输出这些数。
//例：括号内是说明
//输入
//2   (repeat=2) 
//4 10 8 1 2
//5 1 2 5 4 0 
//输出
//2 1 8 10
//0 4 5 2 1

import java.util.Scanner;
public class Test60003{
   public static void main(String []args){
      int ri, repeat;
      int i, n, temp,a[];
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
         n=in.nextInt();
         a=new int[n];
         for(i=0; i<n; i++)
            a[i]=in.nextInt();
         for(i=n-1; i>=0; i--)
            System.out.print(a[i]+" ");
         System.out.println();
      }
   }
}