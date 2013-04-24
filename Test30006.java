//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//以下4种水果的单价分别是3.00元/公斤，2.50元/公斤，4.10元/公斤，10.20元/公斤。
//[1] apples
//[2] pears
//[3] oranges
//[4] grapes
//输入水果的编号，输出该水果的单价。如果输入不正确的编号，显示单价为0。
//例：括号内是说明
//输入
//1   (repeat=1) 
//3   (oranges的编号) 
//输出
//[1] apples
//[2] pears
//[3] oranges
//[4] grapes
//price=4.1

import java.util.Scanner;
public class Test30006{
   public static void main(String[] args){
      int ri, repeat;
      int choice;
      double price;
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
    	  System.out.println("[1] apples");
    	  System.out.println("[2] pears");
    	  System.out.println("[3] oranges");
    	  System.out.println("[4] grapes");
          choice=in.nextInt();
          switch (choice) {
          case 1:
        	  price=3.00;
        	  break; 
          case 2:
        	  price=2.50;
        	  break; 
          case 3:
        	  price=4.10;
        	  break; 
          case 4:
        	  price=10.20;
        	  break; 
          default:
        	  price=0.00;
        	  break;
          }
          System.out.println("price="+price); 
      }
   }
}