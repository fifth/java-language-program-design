//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入 1 个正整数 n和n 阶方阵a中的元素，如果找到a 的鞍点（鞍点的元素值在该行上最大, 在该列上最小）, 就输出它的下标, 否则,输出"NO"（设a最多有1个鞍点）。
//例：括号内是说明
//输入：
//2        (repeat=2)
//4  1  7  4  1 4  8  3  6 1  6  1  2 0  7  8  9  (n=4)
//2  1 7 4 1   (n=2)
//输出：
//a[2][1]=6
//NO 

import java.util.Scanner;
public class Test60019{
   public static void main(String []args){
      int ri, repeat;
      int i,j,k,row[],col[],n,a[][];
      boolean flag=true;
      Scanner in=new Scanner(System.in);
      repeat=in.nextInt();
      for(ri=1; ri<=repeat; ri++){
         n=in.nextInt();
         a=new int[n][n];
         row=new int[n];
         col=new int[n];
         for (i=0;i<n;i++)
             for (j=0;j<n;j++) 
                 a[i][j]=in.nextInt();
         for (i=0;i<n;i++) {
        	 row[i]=0;
        	 col[i]=0;
        	 for (j=0;j<n;j++) {
        		 if (a[i][j]>a[i][row[i]]) row[i]=j;
        		 if (a[j][i]<a[col[i]][i]) col[i]=j;
        	 }
         }
         for (i=0;i<n;i++) {
        	 if (i==col[row[i]]) {
        		 flag=true;
        		 break;
        	 } else {
        		 flag=false;
        	 }
         }
         if(flag)  System.out.println("a["+col[i]+"]["+row[i]+"]="+a[col[i]][row[i]]);
         else   System.out.println("NO");
      }
   }
}