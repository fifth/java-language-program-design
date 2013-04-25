//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一个正整数n，再输入n个整数，将最小值与第一个数交换，最大值与最后一个数交换，然后输出交换后的n个数。
//例：括号内是说明
//输入
//3   (repeat=3) 
//5 4 3 5 1 2
//4 1 5 6 7
//5 5 4 3 2 1 
//输出
//1 3 2 4 5
//1 5 6 7
//1 4 3 2 5

import java.util.Scanner;
public class Test60004{
   public static void main(String []args){
      int ri, repeat;
      int i, index, n, t,a[];
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
         n=in.nextInt();
         a=new int[n];
         for(i=0; i<n; i++)
            a[i]=in.nextInt();
         index=0;
         for (i=0; i<n; i++) {
        	 if (a[i]<a[index]) {
        		 index=i;
        	 }
         }
         t=a[index];
         a[index]=a[0];
         a[0]=t;
         index=0;
         for (i=0; i<n; i++) {
        	 if (a[i]>a[index]) {
        		 index=i;
        	 }
         }
         t=a[index];
         a[index]=a[n-1];
         a[n-1]=t;
         for(i=0; i<n; i++)
            System.out.print(a[i]+" ");
         System.out.println();
      }
   }
}