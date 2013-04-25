//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//程序模拟简单运算器的工作：输入一个算式，遇等号"="说明输入结束，输出结果。
//假设计算器只能进行加减乘除运算，运算数和结果都是整数，4种运算符的优先级相同，按从左到右的顺序计算。
//例：括号内是说明
//输入
//2   (repeat=2)
//15 + 2 / 3 =    (数字与运算符之间有一空格)
//1 + 2 * 10 - 10 / 2 =    (数字与运算符之间有一空格)
//输出
//5
//10 

import java.util.Scanner;
public class Test40033{
  public static void main(String args[]) {
	   int ri, repeat;
	   int op1, op2, res;
	   char operator;
	   Scanner in=new Scanner(System.in);
	   repeat=in.nextInt();
	   for(ri=1; ri<=repeat; ri++){
		 res=0;
	     op1=in.nextInt();
	     operator =(in.next()).charAt(0);
	     while (operator!='=') {
		     op2=in.nextInt();
		     switch (operator) {
		     case '+':
		    	 res=op1+op2;
		    	 break;
		     case '-':
		    	 res=op1-op2;
		    	 break;
		     case '*':
		    	 res=op1*op2;
		    	 break;
		     case '/':
		    	 res=op1/op2;
		    	 break;
		     default:
		    	 break;
		     }
		     op1=res;
		     operator =(in.next()).charAt(0);		     
	     }	     
	     System.out.println(res);
	   }
  }
}