//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入1 个正整数n，计算 s 的前n项的和。
//   s = 1 + 1/2! +....+ 1/n! 
//例：括号内是说明
//输入：
//2    (repeat=2)
//2    (n=2)
//10    (n=10)
//输出：
//1.5
//1.7183

import java.util.Scanner;
public class Test40021{
  public static void main(String args[]){
      int ri, repeat;
      int i,n;
      float s,t;
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
        n=in.nextInt();
        s=0;
        t=1;
        for (i=1; i<=n; i++) {
        	t*=i;
        	s+=1.0/t;
        }
        System.out.println((int)(s*10000+0.5)/10000.);
      }
   }
}