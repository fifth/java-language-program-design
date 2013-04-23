//程序填空，不要改变与输入输出有关的语句。
//输入2个整数time1和time2，表示火车的出发时间和到达时间，计算并输出旅途时间。
//有效的时间范围是0000到2359，不需要考虑出发时间晚于到达时间的情况。
//例：括号内是说明
//输入
//712 1411（出发时间是7：12，到达时间是14：11）
//输出
//The train journey time is 6 hrs 59 mins.

import java.util.Scanner;
public class Test20004 {
   public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int time1, time2, hours, mins;
      time1=in.nextInt();
      time2=in.nextInt();
      if (time2%100>=time1%100) {
    	  hours=time2/100-time1/100;
    	  mins=time2%100-time1%100;
      } else {
    	  hours=time2/100-time1/100-1;
    	  mins=time2%100-time1%100+60;
      }
      System.out.println("The train journey time is "+hours+" hrs "+ mins+" mins.");    
   }
}