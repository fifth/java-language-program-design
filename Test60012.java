//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入 1 个正整数 n(1≤n≤10), 输出一张 20 以内的加法口诀表. 加数与被加数都不大于 n, 分列第一行和第一列.(将加数、被加数、和放入一个二维数组中, 再输出该数组)
//例：括号内是说明
//输入：
//1       (repeat=1)
//3       (n=3)
//输出:
//+   1   2   3   
//1   2   
//2   3   4   
//3   4   5   6   

import java.util.Scanner;
public class Test60012{
   public static void main(String []args){
      int ri, repeat;
      int i,j,n,a[][]=new int[11][11];
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
         n=in.nextInt();
         for (i=0; i<=n; i++) {
        	 a[i][0]=i;
        	 a[0][i]=i;
         }
         for (i=1; i<=n; i++) 
        	 for (j=1; j<=n; j++) {
        		 a[i][j]=a[0][j]+a[i][0];
        	 }
         for( i=0; i<=n; i++ ){
             for( j=0; j<=n; j++ )
                 if(i==0&&j==0) System.out.print( "+   ");
                 else if(i==0||j<=i) System.out.print( a[i][j]+"   ");  
             System.out.println();
         }
      }
   }
}