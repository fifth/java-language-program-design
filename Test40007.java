//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入2个整数begin和end，分别代表摄氏温度的起止值，输出该范围内摄氏温度C和华氏温度F的转换表。
//F = 32 + C * 9 / 5
//输出语句：System.out.println(c+"	"+f);
//例：括号内是说明
//输入
//1   (repeat=1)
//5 7
//输出
//Celsius Fahrenheit
//5	41
//6	42
//7	44

import java.util.Scanner;
public class Test40007 {
   public static void main(String[] args){
      int ri, repeat;
      int begin, c, end, f;
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
	   begin=in.nextInt();
	   end=in.nextInt();
	   System.out.println("Celsius Fahrenheit");
	   for (c=begin; c<=end; c++) {
		   f=32 + c * 9 / 5;
		   System.out.println(c+"	"+f);
	   }
      }
   }
}