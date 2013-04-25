//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一个整数，将它逆序输出。
//要求定义并调用函数reverse(number)，它的功能是返回number的逆序数。例如reverse(12345)的返回值是54321。
//例：括号内是说明
//输入
//4   (repeat=4) 
//123456 -100 -2 99
//输出
//654321
//-1
//-2
//99

import java.util.Scanner;
public class Test50009{
  public static void main(String args[]){
	  int ri,repeat;
	  long n, res;
	  Scanner in=new Scanner(System.in);
	  repeat=in.nextInt();
	  for(ri=1;ri<=repeat;ri++){
		  n=in.nextInt();
		  if (n<0) {
			  res=-reverse(n);
		  } else {
			  res=reverse(n);
		  }
		  System.out.println(res);
	  }
  }
  public static long reverse(long n) {
	  long temp=0;
	  if (n<0) {
		  n=-n;
	  }
	  do {
		  temp=temp*10+n%10;
		  n/=10;
	  } while (n!=0);
	  return temp;
  }
}