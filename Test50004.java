//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一个正整数n，如果它是素数，输出"YES"，否则，输出"NO"（素数就是只能被1和自身整除的正整数，1不是素数，2是素数）。
//要求定义并调用函数prime(m)判断m是否为素数。
//例：括号内是说明
//输入
//4  (repeat=4) 
//1  2  9  17
//输出
//NO    (1不是素数)
//YES   (2是素数) 
//NO    (9不是素数) 
//YES   (17是素数)

import java.util.Scanner;
public class Test50004{
  public static void main(String args[]){
    int ri, repeat,n;
    boolean flag;
    Scanner in=new Scanner(System.in);
    repeat=in.nextInt();
    for(ri=1; ri<=repeat; ri++){
      n=in.nextInt();
      flag=prime(n);
      if(flag) 	System.out.println("YES");
      else 	System.out.println("NO");
    }
  }
  public static boolean prime(int n) {
	  int i;
	  if (n==1) {
		  return false;
	  } else {
		  for (i=2; i<=n/2; i++) {
			  if (n%i==0) return false;
		  }
		  return true;
	  }
  }
}