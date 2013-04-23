//程序填空，不要改变与输入输出有关的语句。
//输入华氏温度f，计算并输出相应的摄氏温度c。c = 5/9(f-32).
//例：括号内是说明
//输入
//17.2 (华氏温度)
//输出
//The temprature is -8.222222222222223

import java.util.Scanner;
public class Test20003 {
   public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      double f, c;
      f=in.nextDouble();
      c=(f-32)*5/9.0;
      System.out.println("The temprature is "+c);    
   }
}