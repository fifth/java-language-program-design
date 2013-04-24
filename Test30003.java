//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入三角形的三条边a, b, c，如果能构成一个三角形，输出面积area和周长perimeter；否则，输出“These sides do not correspond to a valid triangle”。
//在一个三角形中，任意两边之和大于第三边。
//三角形的面积计算公式：
//area*area = s(s-a)(s-b)(s-c)
//其中:s = (a+b+c)/2
//输出代码:
//System.out.println("area="+(int)(area*100+0.5)/100.+";perimeter="+(int)(perimeter*100+0.5)/100.);
//System.out.println("These sides do not correspond to a valid triangle"); 
//
//例：括号内是说明
//输入
//2  (repeat=2) 
//5 5 3
//1 1 4
//输出
//area=7.15;perimeter=13.0
//These sides do not correspond to a valid triangle

import java.util.Scanner;
public class Test30003 {
   public static void main(String[] args){
      int ri, repeat;
      double a, b, c, area, perimeter, s;
	  Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
          a=in.nextFloat();
          b=in.nextFloat();
          c=in.nextFloat();
	      if (a+b>c&&a+c>b&&b+c>a) {
	          perimeter=a+b+c;
	          s=(a+b+c)/2;
	          area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	          System.out.println("area="+(int)(area*100+0.5)/100.+";perimeter="+(int)(perimeter*100+0.5)/100.);
	      } else {
	    	  System.out.println("These sides do not correspond to a valid triangle");
	      }
      }
   }
}