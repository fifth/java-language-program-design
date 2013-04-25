//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数 repeat (0<repeat<10)，做 repeat 次下列运算：
//输入两个正整数m和n，输出它们的最小公倍数和最大公约数。
//输入输出示例：括号内为说明
//输入：
//3        (repeat=3)
//3 7      (m=3,n=7)
//24 4     (m=24,n=4)
//24 18    (m=24,n=18)
//输出：
//the least common multiple:21, the greatest common divisor:1
//the least common multiple:24, the greatest common divisor:4
//the least common multiple:72, the greatest common divisor:6

import java.util.*;
public class Test40014 {
  public static void main(String []args){
	  Scanner in =new Scanner(System.in);  
	  int gcd, lcm, m, n,r;  
	  int repeat, ri;
	  repeat=in.nextInt();
	  for(ri = 1; ri <= repeat; ri++){
		  m=in.nextInt();
		  n=in.nextInt();
		  if(m <= 0 || n <= 0)
			  System.out.println("m <= 0 or n <= 0");
		  else{
			  lcm=m;
			  while (lcm%n!=0) {
				  lcm+=m;
			  }
			  gcd=m*n/lcm;
	          System.out.println("the least common multiple:"+lcm+", the greatest common divisor:"+gcd);
	      }
	}	  
  }
}