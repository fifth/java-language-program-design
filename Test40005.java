//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//读入1 个正整数 n(n<=100)，计算并输出1＋1/3＋1/5＋1/7＋……的前n项和。
//例：括号内是说明
//输入
//2   (repeat=2)
//10
//3
//输出
//2.133256
//1.5333334

import java.util.Scanner;
public class Test40005 {
	public static void main(String[] args) {
	int ri, repeat;
	int i, n, temp;
	float sum;
	Scanner in=new Scanner(System.in);
	repeat=in.nextInt();
	for(ri=1; ri<=repeat; ri++){
	   n=in.nextInt();
	   sum=0;
	   for (i=1; i<=n; i++) {
		   sum+=1.0/(2*i-1);
	   }
	   System.out.println(sum);
	}
   }
}