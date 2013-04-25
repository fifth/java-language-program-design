//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入2 个正整数 m 和 n (1≤m, n)，然后输入该m 行 n 列矩阵a中的元素，分别求出
//各行元素之和, 并存入一维数组row中, 再输出row.
//例：括号内是说明
//输入：
//1    (repeat=1)
//3 2  (m=3, n=2)
//6  3
//1  -8
//3 12
//输出：
//sum of row 0 is 9
//sum of row 1 is -7
//sum of row 2 is 15

import java.util.Scanner;
public class Test60014{
   public static void main(String []args){
      int ri, repeat;
      int i,j,m,n,a[][],row[];
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
         m=in.nextInt();
         n=in.nextInt();
         a=new int[m][n];
         row=new int[m];
         for (i=0;i<m;i++) {
        	 row[i]=0;
             for (j=0;j<n;j++) {
                 a[i][j]=in.nextInt();
                 row[i]+=a[i][j];
             }
         }
         
         for(i=0;i<m;i++)
              System.out.println("sum of row "+i+" is "+row[i]);
      }
   }
}