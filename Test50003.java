//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//读入1 个整数，统计并输出该数中2的个数。
//要求定义并调用函数countdigit(number,digit)，它的功能是统计整数number中数字digit的个数。例如，countdigit(10090,0)的返回值是3。
//例：括号内是说明
//输入：
//3       (repeat=3)
//-21902
//2
//345543
//输出：
//count=2       (-21902中有2个2)
//count=1       (有1个2)
//count=0       (345543中没有2)

import java.util.Scanner;
public class Test50003{
  public static void main(String args[]){
	  int ri, repeat;
	  int count;
	  long n;
	  Scanner in=new Scanner(System.in);
	  repeat=in.nextInt();
	  for(ri=1; ri<=repeat; ri++){
		  n=in.nextInt();
		  if (n<0) {
			  n=-n;
		  }
		  count=countdigit(n,2);
		  System.out.println("count="+count);
	  }
  }
  public static int countdigit(long n, int d) {
	  int count=0;
	  do {
		  if (d==n%10) {
			  count++;
		  }
		  n/=10;
	  } while(n!=0);
	  return count;
  }
}