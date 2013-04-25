//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数 repeat (0<repeat<10)，做 repeat 次下列运算：
//输入1 个正整数n，将其转换为二进制后输出。
//要求定义并调用函数 dectobin(n)，它的功能是输出 n 的二进制。例如，调用dectobin(10)，输出1010。
//输出语句：System.out.print(t);   //t为某位二进制数
//例：括号内是说明
//输入：
//3    (repeat=3)
//15
//100
//0
//输出：
//1111
//1100100
//0

import java.util.Scanner;
public class Test50010{
  public static void main(String args[]){
	  int ri,repeat;
	  int i,n;
	  Scanner in=new Scanner(System.in);
	  repeat=in.nextInt();
	  for(ri=1;ri<=repeat;ri++){
	    n=in.nextInt();
	    if (n==0) {
	    	System.out.print(0);
	    } else {
		    dectobin(n);	
	    }
	    System.out.println();
	  }
	}
  public static void dectobin(int n) {
	  if (n!=0) {
		  dectobin(n/2);
		  System.out.print(n%2);
	  }
  }
}