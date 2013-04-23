//程序填空。
//不要改变输入语句。
//输入x，计算x的平方y。并分别以"y=x*x"和"x*x=y"的形式输出 x 和 y 的值。
//输入输出示例：
//输入：
//3
//输出：（输出中不能出现空格）
//9=3*3
//3*3=9

import java.util.Scanner;
public class Test20012 {
	public static void main(String []args){
		int x,y;
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		y=x*x;
		System.out.println(y+"="+x+"*"+x);
		System.out.println(x+"*"+x+"="+y);
	}
}