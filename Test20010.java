//程序填空，不要改变与输入输出有关的语句。
//输入2个整数 num1 和 num2，计算并输出它们的和、差、积、商与余数。
//输入输出示例：括号内是说明
//输入
//5 3       (num1=5,num2=3)
//输出
//5+3=8
//5-3=2
//5*3=15
//5/3=1
//5%3=2

import java.util.Scanner;
public class Test20010{
     public static void main(String args[]){
    	 int num1,num2;
    	 Scanner in=new Scanner(System.in);
    	 num1=in.nextInt();
    	 num2=in.nextInt();
    	 System.out.println(num1+"+"+num2+"="+(num1+num2));
    	 System.out.println(num1+"-"+num2+"="+(num1-num2));
    	 System.out.println(num1+"*"+num2+"="+(num1*num2));
    	 System.out.println(num1+"/"+num2+"="+(num1/num2));
    	 System.out.println(num1+"%"+num2+"="+(num1%num2));
   }
}