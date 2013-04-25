//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入2个正整数a和n, 求a+aa+aaa+aa…a(n个a)之和。
//例：括号内是说明
//输入
//2  (repeat=2)
//2 3 (a=2, n=3)
//8 5 (a=8, n=5)
//输出
//246   (2+22+222)
//98760 (8+88+888+8888+88888) 

import java.util.Scanner;
public class Test40012{
  public static void main(String args[]){
	  int ri, repeat;
	  int i, n, a, sn, tn;
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
        a=in.nextInt();
        n=in.nextInt();
        sn=0;
        tn=0;
        for (i=1; i<=n; i++) {
        	tn=tn*10+a;
        	sn+=tn;
        }
        System.out.println(sn);
      }
   }
}