//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//读入1 个正整数 n(n<=100)，计算并输出1－1/2＋1/3－1/4＋……的前n项和(四舍五入保留小数4位)。
//例：括号内是说明
//输入
//2   (repeat=2)
//10
//3
//输出
//0.6456
//0.8333

import java.util.Scanner;
public class Test40004 {
   public static void main(String[] args) {
	int ri, repeat;
	int i, n, flag;
	float sum;
	Scanner in=new Scanner(System.in);
	repeat=in.nextInt();
	for(ri=1; ri<=repeat; ri++){
	   n=in.nextInt();
	   sum=0;
	   flag=1;
	   for (i=1; i<=n; i++) {
		   sum+=1.0*flag/i;
		   flag=-flag;
	   }
	   System.out.println((long)(sum*10000+0.5)/10000.);
	}
   }
}