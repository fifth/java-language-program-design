//输入n表示做n次下面的操作：
//输入两个正整数,输出它们的和.
//
//例：
//输入：
//2    //表示n=2,做两次操作
//10 11
//20 30
//
//输出：
//sum=21
//sum=50

import java.util.Scanner;
public class Test10097{
  public static void main(String args[]){
	  int n,a,b,i,sum;
	  Scanner in=new Scanner(System.in);
	  n=in.nextInt();   //输入n
	  for(i=1; i<=n; i++){
		  a=in.nextInt();
		  b=in.nextInt();
		  sum=a+b;2
		  System.out.println("sum="+sum);
	  }
  }
}