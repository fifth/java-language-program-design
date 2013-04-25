//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入1 个正整数n，计算 s 的前n项的和(保留 4 位小数)。
//   s = 1 + 1/2! +....+ 1/n! 
//要求定义并调用函数fact(n)计算n的阶乘。
//例：括号内是说明
//输入：
//2    (repeat=2)
//2    (n=2)
//10    (n=10)
//输出：
//1.5
//1.7183

import java.util.Scanner;
public class Test50001 {
	public static void main(String[] args) {
		int ri,repeat;
		int i,n;
		double s;
		Scanner in=new Scanner(System.in);
		repeat=in.nextInt();
		for(ri=1;ri<=repeat;ri++){
			n=in.nextInt();
			s=0;
			for (i=1; i<=n; i++) {
				s+=1.0/fact(i);
			}
        System.out.println((long)(s*10000+0.5)/10000.);
		}
	}
	public static double fact(int n) {
		if (n==1) {
			return 1;
		} else {
			return n*fact(n-1);
		}
	}
 }