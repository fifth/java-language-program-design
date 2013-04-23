// 程序填空，不要改变与输入输出有关的语句。
// 输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
// 读入1 个正实数eps，计算并输出1－1/3＋1/5－1/7＋……，直到最后一项的绝对值小于eps为止(要求每一项的绝对值均大于等于eps,并以float类型输出数据)。
// 例：括号内是说明
// 输入
// 2   (repeat=2)
// 1E-4
// 0.1
// 输出
// 0.7853
// 0.8349

import java.util.Scanner;
public class Test40006{
	public static void main(String[] args) {
	   int ri, repeat;
	   int temp, flag;
	   double eps, item, sum;
	   Scanner in=new Scanner(System.in);
	   repeat=in.nextInt();
	   for(ri=1; ri<=repeat; ri++){
		   eps=in.nextDouble();
		   sum=0;
		   flag=1;
		   temp=1;
		   item=1.0/temp;
		   while (item>=eps) {
			   sum+=item*flag;
			   flag=-flag;
			   temp+=2;
			   item=1.0/temp;
		   }
		   System.out.println((int)(sum*10000+0.5)/10000.);
	   }
	}
}