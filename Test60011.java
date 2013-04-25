//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//读入 1 个正整数 n(1≤n≤6), 再读入 n 阶方阵 a , 计算该矩阵除副对角线、最后一列和最后一行以外的所有元素之和.(副对角线为从矩阵的右上角至左下角的连线)
//例：括号内是说明
//输入：
//1  (repeat=1)
//4  (n=4)
//2 3 4 1
//5 6 1 1
//7 1 8 1
//1 1 1 1
//sum=35   (2+3+4+5+6+7+8=35)

import java.util.Scanner;
public class Test60011{
   public static void main(String []args){
      int ri, repeat;
      int a[][],i,j,n,sum;
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
         n=in.nextInt();
         a=new int[n][n];
         for(i=0; i<n; i++)
            for(j=0;j<n;j++)
            a[i][j]=in.nextInt();
         sum=0;
         for(i=0; i<n; i++)
             for(j=0;j<n;j++){
            	 if (i!=n-1&&j!=n-1&&i+j!=n-1) {
            		 sum+=a[i][j];
            	 }
             }
         System.out.println("sum="+sum);
      }
   }
}