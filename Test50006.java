//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入2 个正整数m和n(1<=m,n<=10000)，输出m 和n之间所有的Fibonacci数。
//Fibonacci 序列（第1项起）：1  1  2  3  5  8  13  21 ......
//要求定义并调用函数fib(n)，它的功能是返回第n项Fibonacci数。例如，fib(7)的返回值是13。
//输出语句：System.out.print(f+" ");
//
//例：括号内是说明
//输入：
//3      (repeat=3)
//1 10   (m=1, n=10)
//20 100  (m=20, n=100)
//1000 6000  (m=1000, n=6000)
//输出：
//1 1 2 3 5 8        (1到10之间的Fibonacci数)
//21 34 55 89     (20到100之间的Fibonacci数)
//1597 2584 4181   (1000到6000之间的Fibonacci数)

import java.util.Scanner;
public class Test50006{
  public static void main(String args[]){
	  int ri,repeat;
	  int i, m, n;
	  long f;
	  Scanner in=new Scanner(System.in);
	  repeat=in.nextInt();
	  for(ri=1; ri<=repeat; ri++){
	      m=in.nextInt();
	      n=in.nextInt();
	  	  i=1;
	  	  while (fib(i)<=n) {
	  		  if (fib(i)>=m) {
	  			System.out.print(fib(i)+" ");
	  		  }
	  		  i++;
	  	  }
	      System.out.println();
	}
  }
  public static long fib(int n) {
	  if (n==1||n==2) {
		  return 1;
	  } else {
		  return fib(n-1)+fib(n-2);
	  }
  }
}