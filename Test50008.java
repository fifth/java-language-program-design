//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入2 个正整数m和n(1<=m,n<=1000)，输出m 到n之间的所有满足各位数字的立方和等于它本身的数。
//要求定义并调用函数is(number)判断number的各位数字之立方和是否等于它本身。
//输出语句：System.out.print(i+" ");
//例：括号内是说明
//输入：
//2    (repeat=2)
//100 400  (m=100, n=400)
//1 100    (m=1, n=100)
//输出：
//153 370 371 (1*1*1+5*5*5+3*3*3=153; 3*3*3+7*7*7=370; 3*3*3+7*7*7+1*1*1=371)
//1

import java.util.Scanner;
public class Test50008{
  public static void main(String args[]){
	  int ri,repeat;
	  int i, m, n;
	  Scanner in=new Scanner(System.in);
	  repeat=in.nextInt();
	  for(ri=1;ri<=repeat;ri++){
	    m=in.nextInt();
	    n=in.nextInt();
	    if (n==1000) {
	    	n=999;
	    }
		for (i=m; i<=n; i++) {
			if (is(i)) {
				System.out.print(i+" ");
			}
		}
	    System.out.println();
	  }
  }
  public static boolean is(int number) {
	  int a,b,c;
	  a=number%10;
	  b=number/10%10;
	  c=number/100;
	  if (a*a*a+b*b*b+c*c*c==number) {
		  return true;
	  } else {
		  return false;
	  }
  }
}