//程序填空，不要改变与输入输出有关的语句。
//输入1个四位数，将其加密后输出。方法是将该数每一位上的数字加9，然后除以10取余，做为该位上的新数字，最后将第1位和第3位上的数字互换，第2位和第4位上的数字互换，组成加密后的新数。
//例：括号内是说明
//输入
//1257
//输出
//The encrypted number is 4601(每一位上的数字加9除以10取余后，得0146，交换后得到4601)

import java.util.Scanner;
public class Test20005 {
   public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int number, digit1, digit2, digit3, digit4, newnum;
      number=in.nextInt();
      digit4=(number%10+9)%10;
      number=number/10;
      digit3=(number%10+9)%10;
      number=number/10;
      digit2=(number%10+9)%10;
      number=number/10;
      digit1=(number+9)%10;
      newnum=digit3*1000+digit4*100+digit1*10+digit2;
      System.out.println("The encrypted number is "+newnum);    
   }
}