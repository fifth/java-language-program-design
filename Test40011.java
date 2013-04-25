//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一个正整数n，输出 2/1+3/2+5/3+8/5 +...的前n项之和，保留4位小数(不足4位时,不必用0填满4位)。（该序列从第2项起，每一项的分子是前一项分子与分母的和，分母是前一项的分子）
//例：括号内是说明
//输入
//3  (repeat=3) 
//1  5  20
//输出
//2.0      (第1项是2.0)
//8.3917   (前5项的和是8.3917)
//32.6603  (前20项的和是32.6603)

import java.util.Scanner;
public class Test40011 {
   public static void main(String[] args) {
      int ri, repeat;
      int i,n;
      float a,b,s,t;
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
    	  n=in.nextInt();
    	  s=0;
    	  a=2;
    	  b=1;
    	  for (i=1; i<=n; i++) {
    		  s+=a*1.0/b;
    		  t=a+b;
    		  b=a;
    		  a=t;
    	  }
          System.out.println((int)(s*10000+.5)/10000.);
      }
   }
}