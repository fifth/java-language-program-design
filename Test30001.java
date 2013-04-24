//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一个学生的数学成绩，如果它低于60，输出“Fail”，否则，输出“Pass”。
//输出使用System.out.println("Pass");及System.out.println("Fail");
//例：括号内是说明
//输入
//2  (repeat=2) 
//60  59
//输出
//Pass
//Fail

import java.util.Scanner;
public class Test30001{
   public static void main(String[] args){
	  int ri, repeat;
	  int mark;
	  Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
          mark=in.nextInt();
          if (mark<60) {
        	  System.out.println("Fail");
          } else {
        	  System.out.println("Pass");
          }
     }
   }
}