// 程序填空，不要改变与输入输出有关的语句。
// 输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
// 输入整数 x，计算并输出下列函数 f(x) 的值(保留2位小数，如果答案为3.50，则直接显示为3.5)。
// 当 x 等于0时，f(x) = 0，当 x 不等于0时， f(x) = 1/x 。
// 输入输出示例：括号内是说明
// 输入
// 3       (repeat=3)
// 6       (x=6)
// 10      (x=10)
// 0       (x=0)
// 输出
// f(6)=0.17
// f(10)=0.1
// f(0)=0.0

import java.util.Scanner;
public class Test30008{
     public static void main(String args[]){
    	 int repeat, ri,x;
    	 double y;
    	 Scanner in=new Scanner(System.in);
    	 repeat=in.nextInt();
    	 for(ri = 1; ri <= repeat; ri++){
    		 x=in.nextInt();
             if (x==0) {
                y = 0;
             } else {
                y = 1.0/x;
             }
             y = ((int)(y*100+0.5))/100.0;
    		 System.out.println("f("+x+")="+y);
		 }
   }
}
