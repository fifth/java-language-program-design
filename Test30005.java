//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一个职工的月薪salary，输出应交的个人所得税tax。
//tax = rate * (salary-850)
//当 salary <= 850 时，rate = 0%;
//当 850 < salary <= 1350 时，rate = 5%;
//当 1350 < salary <= 2850 时，rate = 10%;
//当 2850 < salary <= 5850 时，rate = 15%;
//当 5850 < salary 时，rate = 20%;
//例：括号内是说明
//输入
//5   (repeat=5)
//1010.87
//32098.76
//800
//4010
//2850
//输出
//tax=8.04
//tax=6249.75
//tax=0.0
//tax=474.0
//tax=200.0

import java.util.Scanner;
public class Test30005 {
   public static void main(String[] args){
      int ri, repeat;
      double rate, salary, tax;
	  Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
          salary=in.nextFloat();
          if (salary<=850) {
        	  tax=0;
          } else if (salary<=1350) {
        	  tax=(salary-850)*0.05;
          } else if (salary<=2850) {
        	  tax=(salary-850)*0.1;
          } else if (salary<=5850) {
        	  tax=(salary-850)*0.15;
          } else {
        	  tax=(salary-850)*0.2;
          }
          System.out.println("tax="+(int)(tax*100+0.5)/100.0); 
      }
   }
}