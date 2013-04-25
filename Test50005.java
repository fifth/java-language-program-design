//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入2 个正整数m和n(1<=m,n<=500)，统计并输出m 和n之间的素数的个数以及这些素数的和（素数就是只能被1和自身整除的正整数，1不是素数，2是素数）。
//要求定义并调用函数prime(m)判断m是否为素数。
//例：括号内是说明
//输入：
//3      (repeat=3)
//1 10   (m=1, n=10)
//20 35  (m=20, n=35)
//14 16  (m=14, n=16)
//输出：
//count=4, sum=17    (1到10之间有4个素数：2,3,5,7)
//count=3, sum=83    (20到35之间有3个素数：23, 29, 31)
//count=0, sum=0     (14到16之间没有素数)

import java.util.Scanner;
public class Test50005{
  public static void main(String args[]){
	  int ri, repeat;
	  int count, i, m, n, sum;
	  Scanner in=new Scanner(System.in);
	  repeat=in.nextInt();
	  for(ri=1; ri<=repeat; ri++){
	      m=in.nextInt();
	      n=in.nextInt();
	      count=0;
	      sum=0;
	  	  for (i=m; i<=n; i++) {
	  		  if (prime(i)) {
	  			  count++;
	  			  sum+=i;
	  		  }
	  	  }
	      System.out.println("count="+count+", sum="+sum);
	}
  }
  public static boolean prime(int n) {
	  int i;
	  if (n==1) {
		  return false;
	  } else {
		  for (i=2; i<=n/2; i++) {
			  if (n%i==0) return false;
		  }
		  return true;
	  }
  }
}