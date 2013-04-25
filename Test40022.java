//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入2 个正整数m和n(1<=m,n<=1000)，输出m 和n之间所有满足各位数字的立方和等于它本身的数。
//输出语句：System.out.println(i);
//例：括号内是说明
//输入：
//2    (repeat=2)
//100 400  (m=100, n=400)
//1 100    (m=1, n=100)
//输出：
//153 (1*1*1+5*5*5+3*3*3=153)
//370 (3*3*3+7*7*7=370)
//371 (3*3*3+7*7*7+1*1*1=371)
//1

import java.util.Scanner;
public class Test40022{
  public static void main(String args[]){
      int ri, repeat;
      int i, digit, m, n, number, sum;
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
        m=in.nextInt();
        n=in.nextInt();
        if (n==1000) {
        	n=999;
        }
        while (m<=n) {
        	i=m%10;
        	number=m/10%10;
        	digit=m/100;
        	if (m==i*i*i+number*number*number+digit*digit*digit) {
        		System.out.println(m);
        	}
        	m++;
        }
      }
   }
}