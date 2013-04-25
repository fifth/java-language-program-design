//程序填空，不要改变与输入输出有关的语句。
//输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
//输入一个整数，从高位开始逐位输出它的各位数字。
//输出语句：System.out.print(digit+" ");
//例：括号内是说明
//输入
//3   (repeat=3) 
//123456
//-600
//8
//输出
//1 2 3 4 5 6
//6 0 0
//8

import java.util.Scanner;
public class Test40032{
    public static void main(String []args ){
        int ri, repeat;
        int digit;
        long n, temp, pow;
        Scanner in=new Scanner(System.in);
        repeat=in.nextInt();
        for(ri=1; ri<=repeat; ri++){
             n=in.nextLong();
             if (n<0) {
            	 n=-n;
             }
             temp=0;
             pow=0;
             do {
            	 temp=temp*10+n%10;
            	 n/=10;
            	 pow++;
             } while (n!=0);
             do {
            	 digit=(int)(temp%10);
            	 temp/=10;
            	 System.out.print(digit+" ");
            	 pow--;
             } while (pow>0);
             System.out.println();
        }
    }
}