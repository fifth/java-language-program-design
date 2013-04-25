//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入三个整数a、b和c，输出其中较大的数。要求定义和调用函数max(a, b, c)找出a、b中较大的数，函数形参a、b和c的类型是int。
//输入输出示例：括号内是说明
//输入
//3       (repeat=3)
//输入：
//5 8 9    (a=5, b=8)
//-1 -10 -5  (a=-1, b=-10)
//1 1 1     (a=1, b=1)
//输出：
//max(5,8,9)=9
//max(-1,-10,-5)=-1
//max(1,1,1)=1

import java.util.Scanner;
public class Test50011 {
 public static void main(String args[]) {
  int ri, repeat;
  int a,b,c,maximun;
  Scanner in = new Scanner(System.in);
  repeat = in.nextInt();
  for (ri = 1; ri <= repeat; ri++) {
     a = in.nextInt();
     b = in.nextInt();
     c=in.nextInt();
     maximun=max(a,b,c);
     System.out.println("max("+a+","+b+","+c+")="+maximun);
  }
 }
 public static int max(int a, int b, int c) {
	 int m=a;
	 if (b>m) {
		 m=b;
	 }
	 if (c>m) {
		 m=c;
	 }
	 return m;
 }
 }