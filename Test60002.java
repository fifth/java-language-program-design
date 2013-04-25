//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一个正整数n (1<n≤10)，再输入n个整数，输出最大值极其下标（设最大值惟一，下标从0开始）。
//例：括号内是说明
//输入
//3   (repeat=3) 
//3 1 6 4
//3 10 8 1
//5 1 2 5 4 0 
//输出
//max=6,index=1    (最大值6的下标是1)
//max=10,index=0   (最大值10的下标是0)
//max=5,index=2    (最大值5的下标是2)

import java.util.Scanner;
public class Test60002{
    public static void main(String []args){
        int ri, repeat;
        int i, index, n, a[];
        Scanner in=new Scanner(System.in);
        repeat=in.nextInt();
        for(ri=1; ri<=repeat; ri++){
             n=in.nextInt();
             a=new int[n] ;
             index=0;
             for(i=0; i<n; i++) {
                 a[i]=in.nextInt();
            	 if (a[i]>a[index]) {
            		 index=i;
            	 }
             }
             System.out.println("max="+a[index]+",index="+index);
        }
   }
}