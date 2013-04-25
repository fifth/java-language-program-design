//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一个正整数n，再输入n个整数，将它们从小到大排序后输出。要求将排序编写为一个sort()方法。
//例：括号内是说明
//输入
//3   (repeat=3) 
//4 5 1 7 6
//3 1 2 3
//5 5 4 3 2 1 
//输出
//1 5 6 7 
//1 2 3 
//1 2 3 4 5 

import java.util.Scanner;
public class Test60030{
   public static void main(String []args){
      int ri, repeat;
      int i, n, a[];
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
         n=in.nextInt();
         a=new int[n];
         for(i=0; i<n; i++)
            a[i]=in.nextInt();
         sort(a);
         for(i=0; i<n; i++)
            System.out.print(a[i]+" ");
         System.out.println();
      }
   }
  public static void sort(int a[]) {
	  int t;
	  for (int i=a.length-1; i>=0; i--) 
		  for (int j=0; j<i; j++) {
			  if (a[j]>a[j+1]) {
				  t=a[j];
				  a[j]=a[j+1];
				  a[j+1]=t;
			  }
		  }
  }
}