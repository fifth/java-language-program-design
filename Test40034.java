//输出m~n之间的所有闰年
//程序填空，不要改变与输入输出有关的语句。
//输入一个repeat(1<repeat<10))，做repeat次下列运算：
//输入正整数m和n（1900<=m<=n<=2100），分别代表年份的起止值，输出该范围内所有的闰年。判断闰年的条件是：能被 4 整除但不能被 100 整除，或者能被 400 整除。
//输出使用语句 System.out.println(year);	
//输入输出示例：括号内是说明
//输入：
//2
//2000 2017
//2030 2040
//输出
//2000
//2004
//2008
//2012
//2016
//2032
//2036
//2040

import java.util.Scanner;
public class Test40034{
   public static void main(String []args){
      int year,m,n,repeat,ri;
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1;ri<=repeat;ri++){
         m=in.nextInt();
         n=in.nextInt();
         for (year=m; year<=n; year++) {
        	 if ((year%4==0&&year%100!=0)||(year%400==0)) {
        		 System.out.println(year);
        	 }
         }
      }
   }
}