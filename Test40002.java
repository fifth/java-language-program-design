//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//读入1 个正整数 n(n<=50)，计算并输出n! 。
//例：括号内是说明
//输入
//3   (repeat=3)
//1 
//10
//5
//输出
//1.0
//3628800.0
//120.0

import java.util.Scanner;
public class Test40002 {
	public static void main(String[] args) {
	   int ri, repeat;
	   int i, n;
	   double fact;
	   Scanner in=new Scanner(System.in);
	   repeat=in.nextInt();
	   for(ri=1; ri<=repeat; ri++){
		   n=in.nextInt();
		   fact=1;
		   for (i=1; i<=n; i++) {
			   fact*=i;
		   }
		   System.out.println(fact);
	   }
	}
}