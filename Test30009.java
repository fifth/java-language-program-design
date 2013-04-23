// 程序填空，不要改变与输入输出有关的语句。
// 输入一个正整数repeat (0<repeat<10)，做repeat次下列运算：
// 输入参数a,b,c，求一元二次方程a*x*x＋b*x＋c＝0的根，结果保留2位小数(如果答案为3.50，则直接显示为3.5)。
// 按情况分别输出以下内容（文字中的标点为西文标点，无空格。括号内为说明）：
// （1）a=b=c=0,meaningless
// （2）a=b=0,c!=0,error
// （3）x=值             （值为-c/b）
// （4）x1=值1           （值1为(-b+Math.sqrt(d))/(2*a)）
//      x2=值2           （值2为(-b-Math.sqrt(d))/(2*a)）
// （5）x1=值1+值2i
//      x2=值1-值2i     （值1为-b/(2*a)，值2为Math.sqrt(-d)/(2*a)）
// 输入输出示例：括号内为说明
// 输入：
// 5               (repeat=5)
// 0 0 0           (a=0,b=0,c=0)
// 0 0 1           (a=0,b=0,c=1)
// 0 2 5           (a=0,b=2,c=5)
// 21 89 35     (a=21,b=89,c=35)
// 2 2 3           (a=2,b=2,c=3)
// 输出：
// a=b=c=0,meaningless
// a=b=0,c!=0,error
// x=-2.5
// x1=-0.44
// x2=-3.8
// x1=-0.5+1.12i
// x2=-0.5-1.12i

import java.util.Scanner;
public class Test30009{
     public static void main(String args[]){
         int repeat, ri;
         int a,b,c,d;
         double x1,x2;
         Scanner in=new Scanner(System.in);
         repeat=in.nextInt();
         for(ri = 1; ri <= repeat; ri++){
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
            if (a==0) {
                if (b==0) {
                    if (c==0){
                        System.out.println("a=b=c=0,meaningless");
                    } else {
                        System.out.println("a=b=0,c!=0,error");
                    }
                } else {
                    x1=-c*1.0/b;
                    if (x1>0) {
                        x1=((int)(x1*100+0.5))*1.0/100;
                    } else {
                        x1=((int)(x1*100-0.5))*1.0/100;
                    }
                    System.out.println("x="+x1);
                }
            } else{
                d=b*b-4*a*c;
                if (d>=0) {
                    x1=(-b+Math.sqrt(d))*1.0/(2*a);
                    x2=(-b-Math.sqrt(d))*1.0/(2*a);
                    if (x1>0) {
                        x1=((int)(x1*100+0.5))*1.0/100;
                    } else {
                        x1=((int)(x1*100-0.5))*1.0/100;
                    }
                    if (x2>0) {
                        x2=((int)(x2*100+0.5))*1.0/100;
                    } else {
                        x2=((int)(x2*100-0.5))*1.0/100;
                    }
                    System.out.println("x1="+x1);
                    System.out.println("x2="+x2);
                } else {
                    x1=-b*1.0/(2*a);
                    x2=Math.sqrt(-d)*1.0/(2*a);
                    if (x1>0) {
                        x1=((int)(x1*100+0.5))*1.0/100;
                    } else {
                        x1=((int)(x1*100-0.5))*1.0/100;
                    }
                    if (x2>0) {
                        x2=((int)(x2*100+0.5))*1.0/100;
                    } else {
                        x2=((int)(x2*100-0.5))*1.0/100;
                    }
                    System.out.println("x1="+x1+"+"+x2+"i");
                    System.out.println("x2="+x1+"-"+x2+"i");
                }
            }
     }
   }
}
