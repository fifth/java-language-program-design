//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一个正整数n (1<n≤10)，再输入n个整数，输出平均值。
//例：括号内是说明
//输入
//2   (repeat=2) 
//3 1 2 -6
//5 12 2 5 4 0 
//输出
//aver=-1.0
//aver=4.6

import java.util.Scanner;
public class Test60001{
	public static void main(String []args){
		int ri, repeat;
		int i, n, sum,a[];
		double aver;
		Scanner in=new Scanner(System.in);
		repeat=in.nextInt();
		for(ri=1; ri<=repeat; ri++){
		    n=in.nextInt();
		    a=new int[n];
		    sum=0;
		    for(i=0; i<n; i++) {
		        a[i]=in.nextInt();
		    	sum+=a[i];
		    }
		    aver=sum*1.0/n;
		    System.out.println("aver="+aver);
		}
	}
}