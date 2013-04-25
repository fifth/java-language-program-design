//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入2 个正整数m和n(1<=m,n<=10000)，输出m 到n之间的所有完数（完数就是因子和与它本身相等的数）。
//要求定义并调用函数factorsum(number)，它的功能是返回number的因子和。例如，factorsum(12)的返回值是16（1+2+3+4+6）。
//输出语句：System.out.print(i+" ");
//例：括号内是说明
//输入：
//2    (repeat=2)
//20 500  (m=100, n=400)
//1 100    (m=1, n=100)
//输出：
//28 496
//1 6 28

import java.util.Scanner;
public class Test50007{
  public static void main(String args[]){
	  int ri,repeat;
	  int i, m, n;
	  Scanner in=new Scanner(System.in);
	  repeat=in.nextInt();
	  for(ri=1;ri<=repeat;ri++){
		  m=in.nextInt();
		  n=in.nextInt();
		  for (i=m; i<=n; i++) {
			  if (i==factorsum(i)) {
				  System.out.print(i+" ");
			  }
		  }
		  System.out.println();
	  }
  }
  public static long factorsum(int number) {
	  long sum=0;
	  if (number==1) {
		  sum=1;
	  }
	  for (int i=1; i<=number/2; i++) {
		  if (number%i==0) {
			  sum+=i;
		  }
	  }
	  return sum;
  }
}