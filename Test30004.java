//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入整数x，若x大于0，y=1；若x等于0，y=0；否则，y=-1，最后输出y。
//例：括号内是说明
//输入
//3  (repeat=3) 
//2  -8  0
//输出
//1     (x=2时y=1)
//-1    (x=-8时y=-1)
//0     (x=0时y=0)

import java.util.Scanner;
public class Test30004{
   public static void main(String[] args){
      int ri, repeat;
      int x, y;
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
          x=in.nextInt();
          if (x>0) {
        	  y=1;
          } else if (x<0) {
        	  y=-1;
          } else {
        	  y=0;
          }
          System.out.println(y); 
      }
   }
}