//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一个正整数n，再输入n个整数，将它们从大到小排序后输出。
//例：括号内是说明
//输入
//3   (repeat=3) 
//4 5 1 7 6
//3 1 2 3
//5 5 4 3 2 1 
//输出
//7 6 5 1 
//3 2 1
//5 4 3 2 1

import java.util.Scanner;
public class Test60005{
   public static void main(String []args){
      int ri, repeat;
      int i, index, k, n, temp,a[];
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
         n=in.nextInt();
         a=new int[n];
         for(i=0; i<n; i++)
            a[i]=in.nextInt();
         for (i=n-1; i>=0; i--) {
        	 for (k=0; k<i; k++) {
        		 if (a[k]<a[k+1]) {
        			 temp=a[k];
        			 a[k]=a[k+1];
        			 a[k+1]=temp;
        		 }
        	 }
         }
         for(i=0; i<n; i++)
            System.out.print(a[i]+" ");
         System.out.println();
      }
   }
}