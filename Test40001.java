//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//读入1 个正整数 n(n<=100)，计算并输出1＋1/2＋1/3＋……＋1/n 。
//例：括号内是说明
//输入
//2   (repeat=2)
//2
//10
//输出
//1.5
//2.929

import java.util.Scanner;
public class Test40001 {
	public static void main(String[] args) {
	   int ri, repeat;
	   int i, n;
	   float sum;
	   Scanner in=new Scanner(System.in);
	   repeat=in.nextInt();
	   for(ri=1; ri<=repeat; ri++){
		   n=in.nextInt();
		   sum=0;
		   for (i=1; i<=n; i++) {
			   sum+=1.0/i;
		   }
		   System.out.println((int)(sum*1000+0.5)/1000.);
	   }
	}
}